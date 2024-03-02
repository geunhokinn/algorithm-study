package inflearn._01_string._08_유효한_팰린드롬;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String up = str.toUpperCase();
        int lt=0, rt=up.length()-1;
        while(lt<rt){
            if (!Character.isAlphabetic(up.charAt(lt))) {
                lt++;
            } else if (!Character.isAlphabetic(up.charAt(rt))) {
                rt--;
            } else {
                if (up.charAt(lt) == up.charAt(rt)) {
                    lt++;
                    rt--;
                } else {
                    return "NO";
                }
            }
        }
        return "YES";
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
//    public String solution(String str){
//        String up = str.toUpperCase();
//        StringBuilder sb = new StringBuilder();
//// 알파벳이 아닌 것을 제거해야 한다.
//        for (char x : up.toCharArray()) {
//            if(Character.isAlphabetic(x)){
//                sb.append(x);
//            }
//        }
//// 기존 sb랑 뒤집은 sb랑 같으면 yes 아니면 no
//        if(sb.toString().equals(sb.reverse().toString())){
//            return "YES";
//        }
//        return "NO";
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        System.out.println(m.solution(str));
//    }
//}
