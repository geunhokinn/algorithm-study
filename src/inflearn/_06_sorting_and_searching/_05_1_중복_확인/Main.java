package inflearn._06_sorting_and_searching._05_1_중복_확인;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public String solution1(int n, int[] arr){
        Arrays.sort(arr);
        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) return "D";
        }
        return "U";
    }

    public String solution(int n, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) return "D";
            set.add(i);
        }
        return "U";
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
        System.out.println(m.solution(n, arr));
    }
}