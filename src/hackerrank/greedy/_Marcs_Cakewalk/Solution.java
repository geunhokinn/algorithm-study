package hackerrank.greedy._Marcs_Cakewalk;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'marcsCakewalk' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY calorie as parameter.
     */

    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        long sum = 0;

        Collections.sort(calorie, Collections.reverseOrder());
        int size = calorie.size();

        for(int i=0; i<size; i++) {
            sum += Math.pow(2, i) * calorie.get(i);
        }

        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] calorieTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> calorie = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieTemp[i]);
            calorie.add(calorieItem);
        }

        long result = Result.marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
