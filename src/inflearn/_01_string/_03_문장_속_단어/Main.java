package inflearn._01_string._03_문장_속_단어;


import java.util.Scanner;

public class Main {
    public String solution(String str){
        int count = 0;
        String answer = " ";
        String[] sa = str.split(" ");
        for(int i = 0; i<sa.length; i++){
            if(sa[i].length() > count){
                count = sa[i].length();
                answer = sa[i];
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(m.solution(str));
    }
}