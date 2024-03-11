package inflearn._08_dfs_bfs_advanced._02_바둑이_승차;

import java.util.Scanner;

public class Main {
    static int n, c, answer=Integer.MIN_VALUE;
    public void DFS(int L, int sum, int[] arr){
        if(sum>c) return;
        if(L==n){
            answer = Math.max(answer, sum);
        }else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        n = scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        main.DFS(0, 0, arr);
        System.out.println(answer);
    }
}