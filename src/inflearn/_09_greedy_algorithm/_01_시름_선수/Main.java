package inflearn._09_greedy_algorithm._01_시름_선수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w){
        this.h = h;
        this.w = w;
    }
    public int compareTo(Body o) {
        return o.h-this.h;
    }
}

public class Main {
    public int solution(ArrayList<Body> arr, int n){
        int answer = 0, max = 0;
        Collections.sort(arr);
        for(Body o : arr) {
            if(o.w > max) {
                max = o.w;
                answer++;
            }
        }
        return answer;
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