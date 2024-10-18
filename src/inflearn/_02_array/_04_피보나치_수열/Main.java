package inflearn._02_array._04_피보나치_수열;

import java.util.Scanner;

public class Main {
    public int[] solution(int num){
        int[] ia = new int[num];
        ia[0] = 1;
        ia[1] = 1;
        for(int i=2; i<num; i++){
            ia[i] = ia[i-1] + ia[i-2];
        }
        return ia;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i : m.solution(num)){
            System.out.print(i+" ");
        }
    }
}