package inflearn._10_dynamic_programming._05_1_동전교환;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] dy;
    public int solution (int[] arr) {
        dy[0] = 0;
        for(int i=1; i<=m; i++) {
            dy[i] = 50;
        }
        for(int i=0; i<n; i++) {
            for(int j=arr[i]; j<=m; j++) {
                if(dy[j]>dy[j-arr[i]]+1) dy[j] = dy[j-arr[i]]+1;
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=scanner.nextInt();
        m = scanner.nextInt();
        dy = new int[m+1];
        System.out.print(main.solution(arr));
    }
}