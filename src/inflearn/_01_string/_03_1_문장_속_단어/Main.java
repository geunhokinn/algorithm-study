package inflearn._01_string._03_1_문장_속_단어;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String[] arr = str.split(" ");
        int len = 0;
        String ans = "";

        for(String st : arr) {
            if(len < st.length()) {
                ans = st;
                len = st.length();
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(m.solution(str));
    }
}