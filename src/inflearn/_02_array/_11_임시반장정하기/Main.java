package inflearn._02_array._11_임시반장정하기;

import java.util.Scanner;

public class Main {
    public int solution(int num, int[][] ia){
        int[] cnt = new int[num];
        for(int i=0; i<num-1; i++){
            for(int j=0; j<num-i-1; j++){
                for(int z=0; z<5; z++) {
                    if (ia[i][z] == ia[i+j+1][z]) {
                        cnt[i]++;
                        cnt[i+j+1]++;
                        break;
                    }
                }
            }
        }

        int answer = 1, tmp = 0;
        for(int i=0; i<num; i++){
            if(tmp < cnt[i]) {
                tmp = cnt[i];
                answer = i+1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] ia = new int[num][5];

        for(int i=0; i<num; i++){
            for(int j=0; j<5; j++){
                ia[i][j] = scanner.nextInt();
            }
        }
        System.out.println(m.solution(num, ia));
    }
}