package inflearn._06_sorting_and_searching._01_선택_정렬;

import java.util.Scanner;

public class Main {
    public int[] solution(int a, int[] arr){
        for(int i=0; i<a-1; i++) {
            int idx = i;
            for(int j=i+1; j<a; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
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