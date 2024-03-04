package inflearn._07_dfs_bfs_basic._04_피보나치_수열;

public class Main {
    static int[] fibo;
    public int DFS(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n]=1;
        else if (n==2) return fibo[n]=1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }

    public static void main(String[] args){
        Main m = new Main();
        int n=45;
        fibo = new int[n+1];
        m.DFS(n);
        for(int i=1; i<=n; i++){
            System.out.print(fibo[i]+" ");
        }
    }
}

//public class Main {
//    public int DFS(int n){
//        if(n==1) return 1;
//        else if (n==2) return 1;
//        else return DFS(n-2) + DFS(n-1);
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        int n=10;
//        for(int i=1; i<=n; i++){
//            System.out.print(m.DFS(i)+" ");
//        }
//    }
//}