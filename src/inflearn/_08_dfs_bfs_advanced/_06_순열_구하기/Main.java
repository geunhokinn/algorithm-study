package inflearn._08_dfs_bfs_advanced._06_순열_구하기;

import java.util.Scanner;

public class Main {
    static int[] pm, ch, arr;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int i : pm) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr=new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        ch = new int[n];
        pm = new int[m];
        main.DFS(0);
    }
}