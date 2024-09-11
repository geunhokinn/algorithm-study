package inflearn._07_dfs_bfs_basic._08_1_송아지_찾기_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int[] dis = {-1, 1, 5};
    int[] ch = new int[10001];
    Queue<Integer> q = new LinkedList<>();
    public int BFS(int a, int b) {
        ch[a] = 1;
        q.offer(a);
        int L = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i=0; i<size; i++) {
                int x = q.poll();
                for (int j=0; j<3; j++) {
                    int nx = x + dis[j];
                    if (nx == b) return L+1;
                    if (nx > 0 && nx < 10001 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(m.BFS(a, b));
    }
}