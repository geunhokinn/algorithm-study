package inflearn._02_array._01_큰_수_출력하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);

        for (int i=1; i<n; i++) {
            if (arr[i] > arr[i-1]) ans.add(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : m.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}
