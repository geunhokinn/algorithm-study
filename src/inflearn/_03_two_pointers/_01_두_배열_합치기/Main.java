package inflearn._03_two_pointers._01_두_배열_합치기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n1, int n2, int[] a, int[] b){
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(p1 < n1 && p2 < n2) {
            if (a[p1] <= b[p2]) {
                ans.add(a[p1++]);
            } else {
                ans.add(b[p2++]);
            }
        }

        while(p1 < n1) {
            ans.add(a[p1++]);
        }
        while(p2 < n2) {
            ans.add(b[p2++]);
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] a = new int[n1];
        for(int i=0; i<n1; i++){
            a[i]= scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] b = new int[n2];
        for(int i=0; i<n2; i++){
            b[i]= scanner.nextInt();
        }
        for(int x : m.solution(n1, n2, a, b)){
            System.out.print(x+" ");
        }
    }
}