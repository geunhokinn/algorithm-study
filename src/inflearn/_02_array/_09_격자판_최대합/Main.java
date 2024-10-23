package inflearn._02_array._09_격자판_최대합;

import java.util.Scanner;

public class Main {
    public int solution(int num, int[][] ia){
        int answer = 0, tmp1 = 0, tmp2 = 0, tmp3 = 0, tmp4 = 0;
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++) {
                tmp1 += ia[i][j];
                tmp2 += ia[j][i];
            }
            if(tmp1>answer) answer=tmp1;
            if(tmp2>answer) answer=tmp2;
            tmp1=0;
            tmp2=0;
            tmp3 += ia[i][i];
            tmp4 += ia[0+i][num-i-1];
        }
        if (tmp3>answer) answer=tmp3;
        if (tmp4>answer) answer=tmp4;

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