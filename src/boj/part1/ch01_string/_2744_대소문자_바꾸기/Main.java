package boj.part1.ch01_string._2744_대소문자_바꾸기;

import java.util.Scanner;

public class Main {
    public StringBuilder solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if('A' <= c && c <= 'Z'){
                sb.append((char)('a' + c - 'A'));
            } else {
                sb.append((char)('A' + c - 'a'));
            }
        }
        return sb;
    }

//    public StringBuilder solution(String str) {
//        StringBuilder sb = new StringBuilder();
//        for(char c : str.toCharArray()){
//            if(Character.isUpperCase(c)) {
//                sb.append(Character.toLowerCase(c));
//            } else {
//                sb.append(Character.toUpperCase(c));
//            }
//        }
//        return sb;
//    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}