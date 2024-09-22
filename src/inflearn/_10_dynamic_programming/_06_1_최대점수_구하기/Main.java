package inflearn._10_dynamic_programming._06_1_최대점수_구하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] dy = new int[m+1];
        for(int i=0; i<n; i++) {
            int ps = scanner.nextInt();
            int pt = scanner.nextInt();
            for (int j=m; j>=pt; j--) {
                if (dy[j] < dy[j-pt] + ps)
                    dy[j] = dy[j-pt] + ps;
            }
        }
        System.out.println(dy[m]);
    }
}