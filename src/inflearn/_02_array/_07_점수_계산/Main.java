package inflearn._02_array._07_점수_계산;

import java.util.Scanner;

public class Main {

    public int solution(int num, String str){
        String[] sa = str.split(" ");
        int score = 0, tmp = 0;
        for(int i=0; i<num; i++){
            if(Integer.valueOf(sa[i])==1){
                tmp++;
                score += tmp;
            } else {
                tmp=0;
            }
        }
        return score;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println(m.solution(num, str));
    }
}
