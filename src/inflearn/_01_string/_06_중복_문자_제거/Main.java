package inflearn._01_string._06_중복_문자_제거;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(String str){
        ArrayList<String> sa = new ArrayList<String>();
        for(char c : str.toCharArray()) {
            if(!sa.contains(String.valueOf(c))) {
                sa.add(String.valueOf(c));
            }
        }
        return sa;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for(String x :m.solution(str)){
            System.out.print(x);
        }
    }
}

//
//import java.util.Scanner;
//
//public class Main {
//    public String solution(String str){
//        String answer = "";
//        for(int i=0; i<str.length(); i++) {
//            if(i == str.indexOf(str.charAt(i))){
//                answer += str.charAt(i);
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        System.out.println(m.solution(str));
//    }
//}