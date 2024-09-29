package programmers.pccp._모의고사_1회._02_체육대회;

class Solution {

    static int[] ch;
    static int n, m;
    static int maxSum = 0;

    public void DFS(int L, int sum, int[][] ability) {
        if (L == m) {
            maxSum = Math.max(maxSum, sum);
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    DFS(L + 1, sum + ability[i][L], ability);
                    ch[i] = 0;
                }
            }
        }
    }

    public int solution(int[][] ability) {
        n = ability.length;
        m = ability[0].length;
        ch = new int[n];
        DFS(0, 0, ability);
        return maxSum;
    }
}
