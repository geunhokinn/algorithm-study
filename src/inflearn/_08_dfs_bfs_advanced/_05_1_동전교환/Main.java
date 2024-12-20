package inflearn._08_dfs_bfs_advanced._05_1_동전교환;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n, m, ans =Integer.MAX_VALUE;
    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) return;
        if (ans < L) return;
        if (sum == m) {
            if (L < ans) ans = L;
        } else {
            for (int i=0; i<n; i++) {
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) arr[i]=scanner.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = scanner.nextInt();
        main.DFS(0, 0, arr);
        System.out.println(ans);
    }
}