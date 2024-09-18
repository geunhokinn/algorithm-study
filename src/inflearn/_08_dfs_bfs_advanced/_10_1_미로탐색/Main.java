package inflearn._08_dfs_bfs_advanced._10_1_미로탐색;

import java.util.Scanner;

public class Main {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int ans =0;
    public void DFS(int x, int y){
        if (x == 7 && y == 7) ans++;
        else {
            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        board = new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j] = scanner.nextInt();
            }
        }
        board[1][1] = 1;
        main.DFS(1, 1);
        System.out.println(ans);
    }
}