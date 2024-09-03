package inflearn._01_string._02_1_대소문자_변환;

import java.util.Scanner;

public class Main {
    public String solution(String str){

        char[] arr = str.toCharArray();

        // 각각의 인덱스에 접근해서 원소를 바꿔야 됨
        for (int i=0; i<arr.length; i++) {
            if (Character.toUpperCase(arr[i]) == arr[i]) {
                // 대문자이면
                arr[i] = Character.toLowerCase(arr[i]);
            } else {
                // 소문자이면
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        return String.valueOf(arr);
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