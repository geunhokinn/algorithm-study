package inflearn._02_array._02_보이는_학생;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr){
        int cnt = 0;
        int max = 0;

        for (int i : arr) {
            if (i > max) {
                cnt++;
                max = i;
            }
        }

        return cnt;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(m.solution(n, arr));
    }
}
