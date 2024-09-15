package inflearn._06_sorting_and_searching._06_1_장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] tmp = new int[n];

        for (int i=0; i<n; i++) {
            tmp[i] = arr[i];
        }

        Arrays.sort(tmp);

        for (int i=0; i<n; i++) {
            if (arr[i] != tmp[i]) ans.add(i+1);
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
        for(int i : m.solution(n, arr)) System.out.print(i+" ");
    }
}
