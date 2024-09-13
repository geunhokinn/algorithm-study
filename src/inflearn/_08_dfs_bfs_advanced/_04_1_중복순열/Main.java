package inflearn._08_dfs_bfs_advanced._04_1_중복순열;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] pm;
    public void DFS(int L) {
        if (L==m) {
            for (int j=0; j<m; j++) System.out.print(pm[j] + " ");
            System.out.println("");
        } else {
            for (int i=1; i<=n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        pm=new int[m];
        main.DFS(0);
    }
}