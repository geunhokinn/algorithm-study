package boj.backtracking._15655_n과_m_6;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] arr, ans, ch;
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int idx, int L) {
        if(L == m) {
            for(int i=0; i<m; i++) {
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
        }else {
            for(int i=idx; i<n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    ans[L] = arr[i];
                    DFS(i, L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 1. 주어진 배열을 받고 정렬한다
        // 2. for문으로 DFS를 순회하는데 다음 레벨에서 시작 시점이+1 되어야함
        // 3. 중복 순열이 아니므로 체크해야함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        ans = new int[m];
        ch = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        DFS(0, 0);

        System.out.println(sb);
    }
}
