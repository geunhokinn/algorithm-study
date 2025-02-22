package boj.backtracking._1759_암호_만들기;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static int[] ch;
    static char[] arr, ans;
    static StringBuilder sb = new StringBuilder();
    static int ja, mo;

    public static void DFS(int idx, int L) {
        if(L == m) {
            ja = 0;
            mo = 0;
            StringBuilder tmp = new StringBuilder();
            for(int i=0; i<m; i++) {
                if(ans[i] == 'a' || ans[i] == 'e' || ans[i] == 'i' || ans[i] == 'o' || ans[i] == 'u') {
                    mo++;
                } else {
                    ja++;
                }
                tmp.append(ans[i]);
            }
            if(ja < 2 || mo < 1) return;
            sb.append(tmp).append("\n");
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
        // 1. 주어진 배열을 입력받고 정렬한다
        // 2. 순회할 때 다음 순회 때 +1 부터 시작해야함
        // 3. 중복이 아니므로 체크해야함
        // 4. 정답에 추가할 때 모음, 자음 체크를 한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr= new char[n];
        ch = new int[n];
        ans = new char[m];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        DFS(0, 0);
        System.out.println(sb);
    }
}
