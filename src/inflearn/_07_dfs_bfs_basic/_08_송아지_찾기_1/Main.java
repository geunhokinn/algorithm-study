package inflearn._07_dfs_bfs_basic._08_송아지_찾기_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();
    public int BFS(int a, int b){
        ch = new int[10001];
        ch[a] = 1;
        q.offer(a);
        int L = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int x = q.poll();
                for(int j=0; j<3; j++){
                    int nx = x + dis[j];
                    if(nx==b) return L+1;
                    if(1<=nx && nx<=10000 && ch[nx]==0){
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 1;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(m.BFS(a, b));
    }
}