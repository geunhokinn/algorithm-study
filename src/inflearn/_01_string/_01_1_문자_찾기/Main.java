package inflearn._01_string._01_1_문자_찾기;

import java.util.Scanner;

public class Main {
    public int solution(String str, char c){

        char upperC = Character.toUpperCase(c);
        int cnt = 0;

        for (char ch : str.toCharArray()) {
            if (Character.toUpperCase(ch) == upperC) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(m.solution(str, c));
    }
}
