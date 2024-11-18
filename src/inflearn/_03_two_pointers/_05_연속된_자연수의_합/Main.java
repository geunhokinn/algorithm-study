package inflearn._03_two_pointers._05_연속된_자연수의_합;

import java.util.Scanner;

public class Main {
    public int solution(int n){
        int[] a = new int[n/2+1];
        int p1 = 0, p2 = 0, tmp = 0, answer = 0;
        for(int i=0; i<a.length; i++){
            a[i] = i+1;
        }
        while(true){
            if(tmp>=n) tmp -= a[p1++];
            else if(a.length==p2) break;
            else tmp += a[p2++];
            if(tmp==n) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(m.solution(n));
    }
}
