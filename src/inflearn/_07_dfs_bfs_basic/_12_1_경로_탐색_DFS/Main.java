package inflearn._07_dfs_bfs_basic._12_1_경로_탐색_DFS;

import java.util.Scanner;

public class Main {
    static int n, m, ans = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if (v == n) {
            ans++;
        } else {
            for (int i=1; i<=n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
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
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b]=1;
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(ans);
    }
}