package inflearn._01_string._02_대소문자_변환;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        char[] ca = str.toCharArray();
        for(int i = 0; i<ca.length; i++){
            if(Character.isUpperCase(ca[i])) {
                ca[i] = Character.toLowerCase(ca[i]);
            } else {
                ca[i] = Character.toUpperCase(ca[i]);
            }
        }
        return String.valueOf(ca);
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(m.solution(str));
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public String solution(String str){
//        String answer = "";
//        for(char x : str.toCharArray()) {
//            if(x>=65 && x<=90) {
//                answer += (char)(x+32);
//            } else {
//                answer += (char)(x-32);
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner s = new Scanner(System.in);
//        String str = s.next();
//        System.out.println(m.solution(str));
//    }
//}