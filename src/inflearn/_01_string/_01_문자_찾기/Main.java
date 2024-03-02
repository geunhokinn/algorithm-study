package inflearn._01_string._01_문자_찾기;

import java.util.Scanner;

public class Main {
    public int solution(String str, char c){
        int count = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char x : str.toCharArray()) {
            if(x==c) count++;
        }
        return count;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(m.solution(str, c));
    }
}
