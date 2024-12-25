package hackerrank.dp._Sherlock_and_Cost;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'cost' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static int cost(List<Integer> B) {
        // Write your code here

        int n = B.size();

        int dp0 = 0;
        int dp1 = 0;

        for (int i = 1; i < n; i++) {

            int nextDp0 = Math.max(dp0, dp1 + Math.abs(1 - B.get(i - 1)));
            int nextDp1 = Math.max(dp0 + Math.abs(B.get(i) - 1), dp1 + Math.abs(B.get(i) - B.get(i - 1)));

            dp0 = nextDp0;
            dp1 = nextDp1;
        }

        return Math.max(dp0, dp1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] BTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> B = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int BItem = Integer.parseInt(BTemp[i]);
                B.add(BItem);
            }

            int result = Result.cost(B);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
