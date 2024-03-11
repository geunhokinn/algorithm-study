package inflearn._08_dfs_bfs_advanced._03_최대점수_구하기;

import java.util.Scanner;

public class Main {
    static int n, m, answer=Integer.MIN_VALUE;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if(time>m) return;
        if(L==n){
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=scanner.nextInt();
            b[i]=scanner.nextInt();
        }
        main.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}