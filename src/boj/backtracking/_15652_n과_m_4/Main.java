package boj.backtracking._15652_n과_m_4;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] ans;
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int idx, int L) {
        if(L == m) {
            for(int i=0; i<m; i++) {
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
        }else {
            for(int i=idx; i<n; i++) {
                ans[L]=i+1;
                DFS(i, L+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 1. for 문으로 i를 돈다. 다음 재귀에서 i 다음 숫자부터
        // 돌아야 함을 주의한다.
        // 2. 중복 순열이 이므로 체크할 필요 없다
        // 3. DFS로 다음 n+1 호출은한다
        // 4. L == m 이 되면 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ans = new int[m];

        DFS(0, 0);
        System.out.println(sb);
    }
}
