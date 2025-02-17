package hackerrank.string._Strong_Password;

import java.io.*;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecialChar = false;

        String specialCharacters = "!@#$%^&*()-+";

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                isDigit = true;
            } else if (Character.isLowerCase(c)) {
                isLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                isUpperCase = true;
            } else if (specialCharacters.indexOf(c) >= 0) {
                isSpecialChar = true;
            }
        }

        int cnt = 0;
        if (!isDigit) cnt++;
        if (!isLowerCase) cnt++;
        if (!isUpperCase) cnt++;
        if (!isSpecialChar) cnt++;

        return Math.max(cnt, 6-n);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

