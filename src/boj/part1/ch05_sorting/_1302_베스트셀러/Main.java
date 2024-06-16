package boj.part1.ch05_sorting._1302_베스트셀러;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] titles = new String[n];
        for (int i = 0; i < n; i++)
            titles[i] = sc.next();

        Arrays.sort(titles);

        String answer = titles[0];
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < n; i++) {
            if (!titles[i].equals(titles[i - 1]))
                currentCount = 0;
            currentCount++;
            if (maxCount < currentCount ||
                    (maxCount == currentCount && titles[i].compareTo(answer) < 0)) {
                maxCount = currentCount;
                answer = titles[i];
            }
        }
        System.out.println(answer);
    }
}