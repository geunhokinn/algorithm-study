package inflearn._06_sorting_and_searching._08_1_이분_검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] arr){
        int ans = 0;
        int lt = 0;
        int rt = n-1;
        Arrays.sort(arr);

        while (lt<=rt) {
            int mid = (lt+rt) / 2;
            if (arr[mid] == m) {
                ans = mid + 1;
                break;
            } else if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
        System.out.println(main.solution(n, m, arr));
    }
}