package boj.backtracking._1182_부분수열의_합;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int ans, n, s;
    static int[] arr;

    public static void DFS(int L, int sum) {
        if(L == n) {
            if(sum == s) ans++;
        } else {
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }
    }

    public static void main(String[] args) throws IOException {

        // 1. DFS(L, sum) 을 사용해서 카운트하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0);

        if(s==0) ans--; // 공집합인 경우 제외
        System.out.println(ans);
    }
}
