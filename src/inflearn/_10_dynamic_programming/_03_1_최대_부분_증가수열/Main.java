package inflearn._10_dynamic_programming._03_1_최대_부분_증가수열;

import java.util.Scanner;

public class Main {
    static int[] dy;
    public int solution(int n, int[] arr){
        dy = new int[n];
        dy[0] = 1;
        int ans = 1;
        for (int i=1; i<n; i++) {
            dy[i] = 1;
            for (int j=0; j<i; j++) {
                if (arr[j] < arr[i] && dy[j]+1 > dy[i]) {
                    dy[i] = dy[j]+1;
                }
            }
            if (ans < dy[i]) ans = dy[i];
        }
        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(m.solution(n, arr));
    }
}
