package inflearn._09_greedy_algorithm._01_1_씨름_선수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    int h;
    int w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

public class Main {
    public int solution(ArrayList<Body> arr, int n){
        int ans = 0;
        int max = Integer.MIN_VALUE;
        Collections.sort(arr);
        for (Body o : arr) {
            if (o.w > max) {
                ans++;
                max = o.w;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(m.solution(arr, n));
    }
}