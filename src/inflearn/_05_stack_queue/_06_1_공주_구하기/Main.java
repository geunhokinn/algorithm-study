package inflearn._05_stack_queue._06_1_공주_구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int a, int b){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=a; i++){
            q.offer(i);
        }
        while(q.size()!=1) {
            for(int i=1; i<b; i++) q.offer(q.poll());
            q.poll();
        }
        return q.poll();
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(m.solution(a, b));
    }
}

