package programmers.pccp._기출문제_1회._02_석유_시추;

import java.util.*;

class Solution {

    class Point{
        int x, y;

        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    static int[][] board;
    static int n,m;
    static int answer=0;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int[] size;
    static int[] check;
    Queue<Point> q = new LinkedList<>();

    public void BFS(int x, int y){
        check = new int[size.length];
        check[y]=1;
        q.offer(new Point(x,y));
        int cnt=1;
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==1){
                    q.offer(new Point(nx, ny));
                    board[nx][ny]=0;
                    cnt++;
                    check[ny]=1;
                }
            }
        }
        for(int i=0; i<check.length; i++){
            if(check[i]==1) size[i] += cnt;
        }
    }

    public int solution(int[][] land) {
        n=land.length; // 행 개수 // 5
        m=land[0].length; // 열 개수 // 8
        board = land; // 주소 복사
        size = new int[land[0].length];

        for(int i=0; i<m; i++){ // 8
            for(int j=0; j<n; j++) // 5
                if(board[j][i]==1){
                    board[j][i]=0;
                    BFS(j,i);
                }
        }

        for(int i=0; i<size.length; i++){
            answer = Math.max(answer, size[i]);
        }
        return answer;
    }
}