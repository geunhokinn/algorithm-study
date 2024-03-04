package inflearn._07_dfs_bfs_basic._01_재귀함수;

public class Main {
    public void DFS(int n){
        if(n==0) return;
        else {
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        Main m = new Main();
        m.DFS(3);
    }
}