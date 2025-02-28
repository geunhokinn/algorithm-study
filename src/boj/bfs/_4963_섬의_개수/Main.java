package boj.bfs._4963_섬의_개수;

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

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;
    static Queue<Point> q = new LinkedList<>();
    static int n, m;

    public static void BFS() {
        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for(int i=0; i<8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<m && ny>=0 && ny<n && board[nx][ny]==1) {
                    board[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 1. 2중 for문으로 board 배열에 입력을 모두 받는다
        // 2. 다시 2중 for문으로 board가 1이면 0으로 바꾸고 q에 넣고
        // bfs를 실행한다(여기서 ans++를 한다)
        // 3. poll하고 bfs를 돌면서 시계방향으로 탐색 후
        // 1이면 0으로 바꾸고 q에 넣는다
        // 4. 정답을 sb에 추가하고 ans=0으로 바꾸고 반복 후 정답 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int ans = 0;
        StringBuilder sb = new StringBuilder();

        while(n != 0 && m != 0) {
            board = new int[m][n];
            for(int i=0; i<m; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    if(board[i][j]==1) {
                        board[i][j]=0;
                        q.offer(new Point(i, j));
                        BFS();
                        ans++;
                    }
                }
            }

            sb.append(ans).append("\n");
            ans = 0;

            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
        }

        System.out.println(sb);
    }
}
