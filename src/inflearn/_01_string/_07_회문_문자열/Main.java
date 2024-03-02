package inflearn._01_string._07_회문_문자열;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String up = str.toUpperCase();
        int lt = 0, rt = str.length()-1;
        while(lt<rt){
            if(up.charAt(lt) == up.charAt(rt)) {
                lt++;
                rt--;
            } else {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(m.solution(str));
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public String solution(String str){
//        if(str.equalsIgnoreCase(String.valueOf(new StringBuilder(str).reverse()))){
//            return "YES";
//        }
//        return "NO";
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        System.out.println(m.solution(str));
//    }
//}

