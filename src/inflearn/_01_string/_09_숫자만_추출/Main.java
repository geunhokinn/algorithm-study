package inflearn._01_string._09_숫자만_추출;

import java.util.Scanner;

public class Main {
    public String solution(String str){
// 1. 숫자만 추출
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
// 2. 만약 맨 앞자리가 0이면 제거해야함
        while (true){
            if(sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            } else {
                break;
            }
        }

// 3. 자연수 만들기
        return sb.toString();
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(m.solution(str));
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public int solution(String str){
//        int sum = 0;
//        for(char c : str.toCharArray()){
//            if(48 <= c && c <= 57) sum += sum*10+(c-48);
//        }
//        return sum;
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        System.out.println(m.solution(str));
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public int solution(String str){
//// 1. 숫자만 추출
//        StringBuilder sb = new StringBuilder();
//        for(char c : str.toCharArray()){
//            if(Character.isDigit(c)){
//                sb.append(c);
//            }
//        }
//        return Integer.valueOf(sb.toString());
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        System.out.println(m.solution(str));
//    }
//}
