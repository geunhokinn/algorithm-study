package inflearn._08_dfs_bfs_advanced._07_조합의_경우수;

import java.util.Scanner;

public class Main {
    int[][] dy = new int[35][35];
    public int DFS(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = DFS(n-1, r-1)+DFS(n-1, r);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(main.DFS(n, r));
    }
}