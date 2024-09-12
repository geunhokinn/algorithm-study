package inflearn._08_dfs_bfs_advanced._03_1_최대점수_구하기;

import java.util.Scanner;

public class Main {
    static int n, m, ans = 0;
    public void DFS(int L, int sumScore, int sumTime, int[] score, int[] time) {
        if (sumTime > m) return;
        if (L == n) {
            if (ans < sumScore) ans = sumScore;
        } else {
            DFS(L+1, sumScore + score[L], sumTime + time[L], score, time);
            DFS(L+1, sumScore, sumTime, score, time);
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
        System.out.println(ans);
    }
}