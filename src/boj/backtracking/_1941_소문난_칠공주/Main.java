package boj.backtracking._1941_소문난_칠공주;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static char[][] board = new char[5][5];
    static int[] combi = new int[7];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int ans=0;

    public static void DFS(int L, int idx) {
        if(L == 7) {
            if(checkCnt()) {
                if(makeLee()) {
                    ans++;
                }
            }
        }else {
            for(int i=idx; i<25; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static boolean checkCnt() {
        int cnt = 0;
        for(int i=0; i<7; i++) {
            int x = combi[i] / 5;
            int y = combi[i] % 5;
            if(board[x][y] == 'S') cnt++;
        }
        if(cnt < 4) return false;

        return true;
    }

    public static boolean makeLee() {
        Queue<Integer> q = new LinkedList<>();
        int[][] check = new int[5][5];
        for(int i=0; i<7; i++) {
            int x = combi[i] / 5;
            int y = combi[i] % 5;
            check[x][y] = 1;
        }

        check[combi[0]/5][combi[0]%5] = 0;
        q.offer(combi[0]);
        int count = 1;

        while(!q.isEmpty()) {
            int tmp = q.poll();
            int x = tmp / 5;
            int y = tmp % 5;
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int next = nx * 5 + ny;
                if(nx>=0 && nx<5 && ny>=0 && ny<5 && check[nx][ny] == 1) {
                    check[nx][ny] = 0;
                    q.offer(next);
                    count++;
                }
            }
        }

        if(count!=7) return false;

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<5; i++) {
            board[i] = br.readLine().toCharArray();
        }

        DFS(0, 0);

        System.out.println(ans);
    }
}
