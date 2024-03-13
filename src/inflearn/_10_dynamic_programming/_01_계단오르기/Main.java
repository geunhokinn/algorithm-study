package inflearn._10_dynamic_programming._01_계단오르기;

import java.util.Scanner;

public class Main {
    static int[] dy;
    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[n];
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        dy = new int[n+1];
        System.out.println(m.solution(n));
    }
}