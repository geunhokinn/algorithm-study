package inflearn._01_string._04_단어_뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(String[] sa){
        ArrayList<String> answer = new ArrayList<String>();
        for(String str : sa){
            char[] tmp = new char[str.length()];
            int i = 1;
            for(char c : str.toCharArray()) {
                tmp[tmp.length-i] = c;
                i++;
            }
            answer.add(String.valueOf(tmp));
        }
        return answer;
    }


    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] sa = new String[num];
        for(int i = 0; i < num; i++){
            sa[i] = scanner.next();
        }
        for(String x : m.solution(sa)){
            System.out.println(x);
        }
    }
}
//
//import java.util.ArrayList;
//        import java.util.Scanner;
//
//public class Main {
//    public ArrayList<String> solution(String[] sa){
//        ArrayList<String> answer = new ArrayList<String>();
//        for(String x : sa) {
//            String tmp = String.valueOf(new StringBuilder(x).reverse());
//            answer.add(tmp);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        String[] sa = new String[num];
//        for(int i = 0; i < num; i++){
//            sa[i] = scanner.next();
//        }
//        for(String x : m.solution(sa)){
//            System.out.println(x);
//        }
//    }
//}