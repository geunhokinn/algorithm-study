package inflearn._03_two_pointers._04_연속_부분_수열;

import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] a){
        int p1 = 0, p2 = 0, tmp = 0, answer = 0;
        while(true) {
            if(tmp >= k) tmp -= a[p1++];
            else if (p2 == n) break;
            else tmp += a[p2++];

            if (tmp == k) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]= scanner.nextInt();
        }
        System.out.println(m.solution(n, k, a));
    }
}