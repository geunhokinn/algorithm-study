package inflearn._09_greedy_algorithm._03_결혼식;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    public int time;
    public char state;
    Time(int time, char state){
        this.time = time;
        this.state = state;
    }

    public int compareTo(Time o){
        if(this.time==o.time) return this.state-o.state;
        else return this.time-o.time;
    }
}

public class Main {
    public int solution(ArrayList<Time> arr){
        int answer=0, cnt = 0;
        Collections.sort(arr);
        for(Time o : arr) {
            if(o.state=='s') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            arr.add(new Time(s, 's'));
            arr.add(new Time(e, 'e'));
        }
        System.out.println(m.solution(arr));
    }
}