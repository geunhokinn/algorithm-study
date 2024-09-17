package inflearn._08_dfs_bfs_advanced._08_1_수열_추측하기;

import java.util.Scanner;

public class Main {
    static int[] arr, ans, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = combi(n-1, r-1)+combi(n-1, r);
    }

    public void DFS(int L, int sum){
        if(flag || sum>f) return;
        if(L==n){
            if(sum==f){
                for(int x : ans) System.out.print(x+" ");
                flag=true;
            }
        } else {
            for(int i=1; i<=n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    ans[L]=i;
                    DFS(L+1, sum+(ans[L]* arr[L]));
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        f = scanner.nextInt();
        arr = new int[n];
        ans = new int[n];
        ch = new int[n+1];
        for(int i=0; i<n; i++){
            arr[i] = main.combi(n-1, i);
        }
        main.DFS(0, 0);
    }
}