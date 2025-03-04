package inflearn._08_dfs_bfs_advanced._12_1_토마토;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class Main {
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m;
    static Queue<Point> q = new LinkedList<>();

    public void BFS(){
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i=0; i<4; i++){
                int nx=tmp.x+dx[i];
                int ny=tmp.y+dy[i];
                if(nx>=1 && nx<=n && ny>=1 && ny<=m && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        board = new int[n+1][m+1];
        dis = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                board[i][j] = scanner.nextInt();
                if(board[i][j]==1) q.offer(new Point(i, j));
            }
        }
        main.BFS();
        boolean flag = true;
        int ans = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(board[i][j] == 0) flag = false;
                if(dis[i][j] > ans) ans = dis[i][j];
            }
        }
        if (flag) {
            System.out.print(ans);
        } else {
            System.out.print(-1);
        }
    }
}