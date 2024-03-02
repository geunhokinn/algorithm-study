package inflearn._01_string._10_가장_짧은_문자_거리;

import java.util.Scanner;

public class Main {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 100;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        p = 100;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (c == str.charAt(i)) {
                p = 0;
            } else {
                p++;
            }
            if (answer[i] > p) {
                answer[i] = p;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for(int x : m.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
