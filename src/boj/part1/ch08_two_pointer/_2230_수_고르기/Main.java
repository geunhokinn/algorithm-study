package boj.part1.ch08_two_pointer._2230_수_고르기;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;
        int r = 0;
        for (int l = 0; l < n; l++) {
            while (arr[r] - arr[l] < m && r < n - 1)
                r++;
            int diff = arr[r] - arr[l];
            if (diff >= m) ans = Math.min(ans, diff);
        }
        System.out.println(ans);
    }
}
