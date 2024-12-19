package hackerrank.greedy._Luck_Balance;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'luckBalance' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. 2D_INTEGER_ARRAY contests
     */

    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here

        int contestsSize = contests.size();
        int ans = 0;

        List<Integer> importantArr = new ArrayList<>();
        List<Integer> unimportantArr = new ArrayList<>();
        for(int i=0; i<contestsSize; i++) {
            if(contests.get(i).get(1)==1) {
                importantArr.add(contests.get(i).get(0));
            }else{
                unimportantArr.add(contests.get(i).get(0));
            }
        }

        Collections.sort(importantArr, Collections.reverseOrder());

        int importantSize = importantArr.size();

        for(int i=0; i<importantSize; i++) {
            if(i<k) {
                ans+=importantArr.get(i);
            }else {
                ans-=importantArr.get(i);
            }
        }

        int unimportantSize = unimportantArr.size();
        for(int i=0; i<unimportantSize; i++) {
            ans+=unimportantArr.get(i);
        }

        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> contests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] contestsRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> contestsRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowTempItems[j]);
                contestsRowItems.add(contestsItem);
            }

            contests.add(contestsRowItems);
        }

        int result = Result.luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
