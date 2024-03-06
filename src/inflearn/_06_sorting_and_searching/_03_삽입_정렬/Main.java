package inflearn._06_sorting_and_searching._03_삽입_정렬;

import java.util.Scanner;

public class Main {
    public int[] solution(int a, int[] arr){
        for(int i=1; i<a; i++) {
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--) {
                if (arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
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