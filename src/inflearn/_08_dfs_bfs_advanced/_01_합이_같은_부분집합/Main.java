package inflearn._08_dfs_bfs_advanced._01_합이_같은_부분집합;

import java.util.Scanner;

public class Main {
    static String answer="NO";
    static int n, total=0;
    boolean flag=false;
    public void DFS(int L, int sum, int[] arr){
        if(total-sum<sum) return;
        if(flag) return;
        if(L==n){
            if(total-sum==sum) {
                answer="YES";
                flag=true;
            }
        }else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
            total+=arr[i];
        }
        main.DFS(0, 0, arr);
        System.out.println(answer);
    }
}