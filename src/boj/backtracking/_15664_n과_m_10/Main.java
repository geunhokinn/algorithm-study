package boj.backtracking._15664_n과_m_10;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] arr, ans, ch;
    static StringBuilder sb = new StringBuilder();
    static Set<String> set = new HashSet<>();

    public static void DFS(int idx, int L) {
        if(L == m) {
            StringBuilder tmp = new StringBuilder();
            for(int i=0; i<m; i++) {
                tmp.append(ans[i]).append(" ");
            }
            String tmpString = tmp.toString();
            if(!set.contains(tmpString)) {
                set.add(tmpString);
                sb.append(tmpString).append("\n");
            }
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
        // 4. 중복 되는 순열이 있으면 set으로 제거한다

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
