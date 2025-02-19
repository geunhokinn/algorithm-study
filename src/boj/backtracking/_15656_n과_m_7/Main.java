package boj.backtracking._15656_n과_m_7;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] arr, ans;
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int L) {
        if(L == m) {
            for(int i=0; i<m; i++) {
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
        }else {
            for(int i=0; i<n; i++) {
                ans[L] = arr[i];
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 1. 주어진 배열을 받고 정렬한다
        // 2. for문으로 DFS를 순회
        // 3. 중복 순열이므로 체크 필요없음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        ans = new int[m];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        DFS(0);

        System.out.println(sb);
    }
}