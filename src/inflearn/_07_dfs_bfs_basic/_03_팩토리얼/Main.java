package inflearn._07_dfs_bfs_basic._03_팩토리얼;

public class Main {
    public int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args){
        Main m = new Main();
        System.out.println(m.DFS(5));
    }
}