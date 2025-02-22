package boj.backtracking._15665_n과_m_11;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] arr, ans;
    static StringBuilder sb = new StringBuilder();
    static Set<String> set = new HashSet<>();

    public static void DFS(int L) {
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
            for(int i=0; i<n; i++) {
                ans[L] = arr[i];
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        // 1. 주어진 배열을 입력 받고 정렬한다
        // 2. 중복 순열이므로 체크할 필요 없다
        // 3. 대신 중복해서 나올 수 있으므로 똑같은 수열은 제거

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        ans = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        DFS(0);

        System.out.println(sb);
    }
}
