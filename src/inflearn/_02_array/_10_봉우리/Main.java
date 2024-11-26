package inflearn._02_array._10_봉우리;

import java.util.Scanner;

public class Main {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int num, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < num && ny >= 0 && ny < num && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

        public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] ia = new int[num][num];

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                ia[i][j] = scanner.nextInt();
            }
        }
        System.out.println(m.solution(num, ia));
    }
}
