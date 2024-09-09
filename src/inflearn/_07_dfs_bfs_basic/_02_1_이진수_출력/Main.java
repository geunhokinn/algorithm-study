package inflearn._07_dfs_bfs_basic._02_1_이진수_출력;

public class Main {
    public void DFS(int n){
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args){
        Main m = new Main();
        m.DFS(11);
    }
}