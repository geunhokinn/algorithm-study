package inflearn._09_greedy_algorithm._04_최대_수입_스케줄;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
    public int money;
    public int time;
    Lecture(int money, int time){
        this.money = money;
        this.time = time;
    }

    public int compareTo(Lecture o){
        return o.time-this.time;
    }
}

public class Main {
    static int n, max=Integer.MIN_VALUE;
    public int solution(ArrayList<Lecture> arr){
        int answer=0;
        Collections.sort(arr);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int j=0;
        for(int i=max; i>=1; i--){
            for(; j<n; j++){
                if(arr.get(j).time<i) break;
                pq.offer(arr.get(j).money);
            }
            if(!pq.isEmpty()) answer+=pq.poll();
        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            arr.add(new Lecture(m, d));
            if(d>max) max=d;
        }
        System.out.println(main.solution(arr));
    }
}