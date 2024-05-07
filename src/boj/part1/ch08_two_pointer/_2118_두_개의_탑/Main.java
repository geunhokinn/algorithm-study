package boj.part1.ch08_two_pointer._2118_두_개의_탑;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int l = 0, r = 0, ans = 0, leftValue = 0, rightValue = 0;
        while (true) {
            leftValue = sum - rightValue;
            ans = Integer.max(ans, Integer.min(rightValue, leftValue));
            if (rightValue <= leftValue) {
                if(r == n) break;
                rightValue += arr[r];
                r++;
            } else {
                rightValue -= arr[l];
                l++;
            }
        }
        System.out.println(ans);
    }
}
