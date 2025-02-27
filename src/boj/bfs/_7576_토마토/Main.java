package boj.bfs._7576_토마토;

import java.util.*;
import java.lang.*;
import java.io.*;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static Queue<Point> q = new LinkedList<>();
    static int n, m;

    public static void BFS() {
        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for(int i=0; i<4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0) {
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 1. 입력 받으면서 모든 토마토가 익어있는 상태라면 바로 종료한다
        // 그렇지 않으면 bfs를 호출한다
        // 2. 1번을 진행하면서 1이라면 q에 넣는다
        // 3. bfs로 탐색하면서 0 이면 방문하고 1로 체크한다
        // 4. dis 배열에 그 전 일자에 +1을 한다
        // (int ans로 하면 일자 계산이 안됨)
        // 5. bfs 종료 후 0 이 남아있으면 -1을 출력하고
        // 남아 있지 않다면 정답을 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        dis = new int[n][m];

        int input, ans = -1;
        boolean flag = true;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                input = Integer.parseInt(st.nextToken());
                if(input == 0) flag = false;
                if(input == 1) q.offer(new Point(i, j));
                board[i][j] = input;
            }
        }

        if(flag) {
            System.out.println(0);
            return;
        }else BFS();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(board[i][j]==0) {
                    System.out.println(-1);
                    return;
                }
                ans = Math.max(ans, dis[i][j]);
            }
        }

        System.out.println(ans);
    }
}
