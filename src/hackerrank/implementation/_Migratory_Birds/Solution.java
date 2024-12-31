package hackerrank.implementation._Migratory_Birds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        Map<Integer, Integer> birds = new HashMap<>();

        // for(int i=0; i<size; i++) {
        //     if(birds.containsKey(arr.get(i))) {
        //         birds.put(arr.get(i), birds.get(arr.get(i))+1);
        //     } else {
        //         birds.put(arr.get(i), 1);
        //     }
        // }
        for(int bird : arr) {
            birds.put(bird, birds.getOrDefault(bird, 0) + 1);
        }

        int max = 0;
        int ans = 0;
        for(Integer i : birds.keySet()) {
            if(birds.get(i) > max) {
                max = birds.get(i);
                ans = i;
            }
        }

        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
