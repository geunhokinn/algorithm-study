package inflearn._01_string._11_문자열_압축;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        str += " ";
        String s = "";
        int num = 1;
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i) == str.charAt(i+1))){
                num++;
            } else {
                s += str.charAt(i);
                if(num > 1){
                    s += num;
                }
                num = 1;
            }
        }
        return s;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(m.solution(str));
    }
}