package boj.part1.ch08_two_pointer._15831_준표의_조약돌;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        int r = 0, countBlack = 0, countWhite=0, ans = 0;
        for (int l = 0; l < n; l++) {
            while (r < n) {
                if (countBlack == b && arr[r] == 'B') break;
                if (arr[r++] == 'W') countWhite++;
                else countBlack++;
            }
            if (countWhite >= w) ans = Math.max(ans, r-l);
            if (arr[l] == 'W') countWhite--;
            else countBlack--;
        }
        System.out.println(ans);
    }
}
