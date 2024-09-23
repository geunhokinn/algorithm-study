package inflearn._08_dfs_bfs_advanced._14_1_섬나라_아일랜드_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int ans = 0, n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point> queue = new LinkedList<>();
    public void BFS(int x, int y, int[][] board){
        board[x][y] =0;
        queue.offer(new Point(x, y));
        while(!queue.isEmpty()){
            Point tmp = queue.poll();
            for(int i=0; i<8; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                    board[nx][ny]=0;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1){
                    ans++;
                    main.BFS(i, j, arr);
                }
            }
        }

        System.out.println(ans);
    }
}