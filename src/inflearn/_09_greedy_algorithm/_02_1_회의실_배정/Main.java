 package inflearn._09_greedy_algorithm._02_1_회의실_배정;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    public int s, e;
    Time(int s, int e){
        this.s = s;
        this.e = e;
    }

    public int compareTo(Time o){
        if(this.e==o.e) return this.s-o.s;
        else return this.e-o.e;
    }
}

public class Main {
    public int solution(ArrayList<Time> arr, int n){
        int ans = 0;
        int et = 0;
        Collections.sort(arr);
        for (Time t : arr) {
            if (t.s >= et) {
                ans++;
                et = t.e;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            arr.add(new Time(s, e));
        }
        System.out.println(m.solution(arr, n));
    }
}