package hackerrank.string._Separate_the_Numbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

    public static void separateNumbers(String s) {
        // Write your code here
        int len = s.length();

        for (int i = 1; i <= len / 2; i++) {
            String startString = s.substring(0, i);

            if (startString.startsWith("0")) {
                continue;
            }

            long startNumber = Long.parseLong(startString);
            StringBuilder sequence = new StringBuilder(startString);

            while (sequence.length() < len) {
                sequence.append(++startNumber);
            }

            if (sequence.toString().equals(s)) {
                System.out.println("YES " + startString);
                return;
            }
        }

        System.out.println("NO");
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            Result.separateNumbers(s);
        }

        bufferedReader.close();
    }
}

