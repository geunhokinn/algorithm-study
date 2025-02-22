package boj.backtracking._6603_로또;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m = 6;
    static int[] arr, ans, ch;
    static StringBuilder sb;

    public static void DFS(int idx, int L) {
        if(L == m) {
            for(int i=0; i<m; i++) {
                sb.append(ans[i]).append(" ");
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

    public static void main(String[] args) throws IOException{
        // 1. 주어진 배열을 입력 받는다
        // 2. 순회할 때 다음 순회 때 +1 부터 시작해야함
        // 3. 중복이 아니므로 체크해야함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        while(n != 0) {
            arr= new int[n];
            ch = new int[n];
            ans = new int[m];
            sb = new StringBuilder();

            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            DFS(0, 0);
            System.out.println(sb);

            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
        }
    }
}
