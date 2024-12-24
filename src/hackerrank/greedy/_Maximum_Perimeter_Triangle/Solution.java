package hackerrank.greedy._Maximum_Perimeter_Triangle;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        Collections.sort(sticks);

        for(int i = sticks.size() - 1; i >= 2; i--) {
            int a = sticks.get(i - 2);
            int b = sticks.get(i - 1);
            int c = sticks.get(i);

            if (a + b > c) {
                return Arrays.asList(a, b, c);
            }
        }

        return Arrays.asList(-1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sticksTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> sticks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sticksItem = Integer.parseInt(sticksTemp[i]);
            sticks.add(sticksItem);
        }

        List<Integer> result = Result.maximumPerimeterTriangle(sticks);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
