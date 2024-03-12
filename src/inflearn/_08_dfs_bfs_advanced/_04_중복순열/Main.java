package inflearn._08_dfs_bfs_advanced._04_중복순열;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] pm;
    public void DFS(int L) {
        if(L==m){
            for(int i : pm) System.out.print(i+" ");
            System.out.println();
        }else{
            for(int i=1; i<=n; i++){
                pm[L]=i;
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