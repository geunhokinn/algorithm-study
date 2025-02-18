package boj.backtracking._15649_n과_m_1;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] ch, ans;

    public static void DFS(int L) {
        if(L == m) {
            for(int i=0; i<m; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }else {
            for(int i=0; i<n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    ans[L] = i+1;
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 1. for 문으로 i를 돈다.
        // 2. 체크가 안되어 있으면 진입해서 체크를 하고,
        // 해당 숫자를 우리가 만들고 싶은 ans 배열에 넣는다
        // 3. DFS로 다음 n+1 호출은한다
        // 4. (중복 순열이 아니므로)돌아 왔으면 체크를 해제한다
        // 5. L == m 이 되면 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ch = new int[n];
        ans = new int[m];

        DFS(0);
    }
}
