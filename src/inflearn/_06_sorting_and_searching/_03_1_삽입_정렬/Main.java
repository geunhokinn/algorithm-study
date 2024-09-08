package inflearn._06_sorting_and_searching._03_1_삽입_정렬;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){

        int tmp = 0;

        for (int i=1; i<n; i++) {
            tmp = arr[i];
            int j;
            for (j=i-1; j>=0; j--) {
                if (arr[j]>tmp) {
                    arr[j+1] = arr[j];
                } else break;
            }
            arr[j+1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
        for(int i : m.solution(n, arr)) System.out.print(i+" ");
    }
}