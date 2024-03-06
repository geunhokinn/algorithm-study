package inflearn._06_sorting_and_searching._04_least_recently_used;

import java.util.Scanner;

public class Main {
    public int[] solution(int s, int n, int[] arr){
        int[] cache = new int[s];
        for(int x : arr){
            int tmp = -1;
            for(int i=0; i<s; i++) if(x==cache[i]) tmp = i;
            if(tmp == -1){
                for(int i=s-1; i>0; i--){
                    cache[i] = cache[i-1];
                }
            } else {
                for(int i=tmp; i>0; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
        for(int i : m.solution(s, n, arr)) System.out.print(i+" ");
    }
}