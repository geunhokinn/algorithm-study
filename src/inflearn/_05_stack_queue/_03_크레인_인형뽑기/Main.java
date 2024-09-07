package inflearn._05_stack_queue._03_크레인_인형뽑기;

import java.util.*;

public class Main {
    public int solution(int n, int[][] board, int m, int[] moves){
        Stack<Integer> s = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j ++) {
                if (board[j][moves[i]-1] != 0) {
                    if (!s.isEmpty() && board[j][moves[i]-1] == s.peek()) {
                        s.pop();
                        cnt += 2;
                    } else {
                        s.push(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Main t = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = scanner.nextInt();
        }
        System.out.println(t.solution(n, board, m, moves));
    }
}
