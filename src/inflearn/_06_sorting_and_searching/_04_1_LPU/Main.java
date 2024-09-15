package inflearn._06_sorting_and_searching._04_1_LPU;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public int[] solution1(int s, int n, int[] arr){
        int[] cache = new int[s];
        for (int x : arr) {
            int idx = -1;
            for (int i = 0; i < s; i++) {
                if (cache[i] == x) {
                    idx = i;
                    break;
                }
            }
            if (idx == -1) {
                for (int i = s-1; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {
                for (int i = idx; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }

    public int[] solution(int s, int n, int[] arr){
        LinkedList<Integer> cache = new LinkedList<>();
        int[] ans = new int[s];

        for (int i : arr) {
            if (cache.contains(i)) cache.remove((Integer) i);
            cache.addFirst(i);
            if (cache.size() > s) cache.removeLast();
        }

        for (int i=0; i<s; i++) {
            ans[i] = cache.get(i);
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
        for(int i : m.solution(s, n, arr)) System.out.print(i+" ");
    }
}