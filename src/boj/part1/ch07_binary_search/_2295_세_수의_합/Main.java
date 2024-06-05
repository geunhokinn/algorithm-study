package boj.part1.ch07_binary_search._2295_세_수의_합;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Set<Integer> sum = new HashSet<>();
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                sum.add(arr[i] + arr[j]);

        int ans = -1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int target = arr[i] - arr[j];
                if (sum.contains(target))
                    ans = Math.max(ans, arr[i]);
            }
        System.out.println(ans);
    }
}
