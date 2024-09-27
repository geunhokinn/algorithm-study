package programmers.pcce._기출문제_1회._09_이웃한_칸;

import java.util.*;

class Solution {

    class Point {

        int h;
        int w;

        Point (int h, int w){
            this.h = h;
            this.w = w;
        }
    }

    public int solution(String[][] board, int h, int w) {

        int n = board.length;
        int count = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(h, w));

        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for(int i=0; i<4; i++) {
                int nx = tmp.h + dx[i];
                int ny = tmp.w + dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny].equals(board[h][w])) {
                    count++;
                }
            }
        }

        return count;
    }
}
