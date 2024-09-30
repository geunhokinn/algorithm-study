package programmers.pccp._모의고사_1회._03_유전법칙;

class Solution {

    public String DFS(int n, int p) {
        if (n == 1) return "Rr";

        int parentP = (p + 3) / 4;
        String parentG = DFS(n - 1, parentP);

        if (parentG == "RR") return "RR";
        else if (parentG == "rr") return "rr";
        else {
            if (p % 4 == 1) return "RR";
            else if (p % 4 == 0) return "rr";
            else return "Rr";
        }
    }

    public String[] solution(int[][] queries) {
        String[] answer = new String[queries.length];
        for(int i=0; i<queries.length; i++) {
            int n = queries[i][0];
            int p = queries[i][1];
            answer[i] = DFS(n, p);
        }
        return answer;
    }
}
