package inflearn._06_sorting_and_searching._01_1_선택_정렬;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){

        int idx = 0;
        int tmp = 0;
        for (int i=0; i<n-1; i++) {
            idx = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[idx])
                    idx = j;
            }
            tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
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
