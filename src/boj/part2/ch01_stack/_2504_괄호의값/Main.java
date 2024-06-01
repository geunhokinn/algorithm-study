package boj.part2.ch01_stack._2504_괄호의값;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int[] stack = new int[arr.length];

        int ans = 0, index = -1, multiple = 1;
        for (int i = 0; i < arr.length; i++) {
            int number = changeNumber(arr[i]);
            if (arr[i] == '(' || arr[i] == '[') {
                stack[++index] = number;
                multiple *= number;
            } else {
                if (index < 0 || stack[index--] != number) {
                    ans = 0;
                    break;
                }
                if (arr[i - 1] == '(' || arr[i - 1] == '[') ans += multiple;
                multiple /= number;
            }
        }
        System.out.println(index < 0 ? ans : 0);
    }

    static int changeNumber(char c) {
        if (c == '(' || c == ')') return 2;
        else if (c == '[' || c == ']') return 3;
        return -1;
    }
}
