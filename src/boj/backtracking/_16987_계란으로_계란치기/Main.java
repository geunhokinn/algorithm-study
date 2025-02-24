package boj.backtracking._16987_계란으로_계란치기;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int n, ans = 0;
    static int[][] arr;

    public static void DFS(int now) {
        if(now == n) {
            int cnt = 0;
            for(int i=0; i<n; i++) {
                if(arr[i][0] <= 0) cnt++;
            }
            ans = Math.max(cnt, ans);
            return;
        }

        if(arr[now][0] <= 0) {
            DFS(now+1);
            return;
        }

        boolean isAllBroken = true;
        for(int next=0; next<n; next++) {
            if(now == next || arr[next][0] <= 0) continue;

            arr[now][0] -= arr[next][1];
            arr[next][0] -= arr[now][1];

            isAllBroken = false;
            DFS(now+1);

            arr[now][0] += arr[next][1];
            arr[next][0] += arr[now][1];
        }
        if(isAllBroken) DFS(now+1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        arr = new int[n][2];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        DFS(0);

        System.out.println(ans);
    }
}
