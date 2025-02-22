package boj.backtracking._15666_n과_m_12;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] arr, ans;
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
                ans[L] = arr[i];
                DFS(i, L+1);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        // 1. 주어진 배열을 입력 받고 정렬한다
        // 2. 순회할 때 다음 순회 때 +1 부터 시작해야함
        // 3. 중복 순열이므로 체크할 필요 없다
        // 4. 대신 중복해서 나올 수 있으므로 똑같은 수열은 제거

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

        DFS(0, 0);

        System.out.println(sb);
    }
}
