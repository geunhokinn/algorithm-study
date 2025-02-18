package boj.backtracking._15654_n과_m_5;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] ch, ans, arr;
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int L) {
        if(L == m) {
            for(int i=0; i<m; i++) {
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
        }else {
            for(int i=0; i<n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    ans[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 1. 처음 입력을 받고 정렬한다.
        // 2. for 문으로 i를 돈다.
        // 3. 중복 순열이 아니므로 체크 해야한다.
        // 4. DFS로 다음 n+1 호출은한다
        // 5. L == m 이 되면 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ch = new int[n];
        ans = new int[m];
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        DFS(0);
        System.out.println(sb);
    }
}
