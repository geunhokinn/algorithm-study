package inflearn._08_dfs_bfs_advanced._09_조합_구하기;

import java.util.Scanner;

public class Main {
    static int[] combi;
    static int n, m;
    public void DFS(int L, int s){
        if(L==m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        } else {
            for(int i=s; i<=n; i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        combi = new int[m];
        main.DFS(0, 1);
    }
}