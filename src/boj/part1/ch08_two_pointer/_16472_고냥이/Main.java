package boj.part1.ch08_two_pointer._16472_고냥이;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        int[] alpha = new int[26];
        int r = 0;
        int ans = 0;
        for (int l = 0; l < arr.length; l++) {
            while (r < arr.length) {
                alpha[arr[r++] - 'a']++;
                if (countAlpha(alpha) > N) {
                    alpha[arr[--r] - 'a']--;
                    break;
                }
            }
            ans = Math.max(ans, r - l);
            alpha[arr[l] - 'a']--;
        }
        System.out.println(ans);
    }

    static int countAlpha(int[] alpha) {
        int count = 0;
        for (int i = 0; i < alpha.length; i++)
            if (alpha[i] > 0)
                count++;
        return count;
    }
}
