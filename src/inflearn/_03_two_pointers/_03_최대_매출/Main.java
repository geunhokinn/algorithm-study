package inflearn._03_two_pointers._03_최대_매출;

import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] a){
        int max = 0;
        int sum = 0;
//        int p1 = 0;
//        int p2 = k-1;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
//        while (p2 < n-1) {
//            if (max < sum) {
//                max = sum;
//            }
//            sum = sum - a[p1++] + a[++p2];
//        }
        int i = 0;
        while (k < n) {
            if (max < sum) {
                max = sum;
            }
            sum += a[k++] - a[i++];
        }

        return max;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]= scanner.nextInt();
        }
        System.out.println(m.solution(n, k, a));
    }
}
