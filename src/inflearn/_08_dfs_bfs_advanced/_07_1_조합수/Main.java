package inflearn._08_dfs_bfs_advanced._07_1_조합수;

import java.util.Scanner;

public class Main {
    int[][] arr = new int[35][35];
    public int DFS(int n, int r) {
        if (arr[n][r] > 0) return arr[n][r];
        if (n==r || r==0) return 1;
        else return arr[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(main.DFS(n, r));
    }
}