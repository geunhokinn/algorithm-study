package inflearn._01_string._05_특정_문자_뒤집기;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt<rt){
            if(!(Character.isAlphabetic(s[lt]))) lt++;
            else if(!(Character.isAlphabetic(s[rt]))) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(s);
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(m.solution(str));
    }
}
