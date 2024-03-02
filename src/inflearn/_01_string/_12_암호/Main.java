package inflearn._01_string._12_암호;

import java.util.Scanner;

public class Main {
    public int[] solution(int num, String str){
        StringBuilder sb = new StringBuilder(str.replace('#', '1').replace('*','0'));
        int[] ia = new int[num];
        for(int i = 0; i<num; i++){
            ia[i] = (Integer.valueOf(sb.substring(0,7),2));
            sb.delete(0,7);
        }
        return ia;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        for(int i : m.solution(num, str)){
            System.out.print((char)i);
        }
    }
}