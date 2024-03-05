package inflearn._06_sorting_and_searching._02_버블_정렬;

import java.util.Scanner;

public class Main {
    public int[] solution(int a, int[] arr){
        for(int i=0; i<a-1; i++) {
            for(int j=0; j<a-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++) arr[i] = scanner.nextInt();
        for(int i : m.solution(a, arr)) System.out.print(i+" ");
    }
}