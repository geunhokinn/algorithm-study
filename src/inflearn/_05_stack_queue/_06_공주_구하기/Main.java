package inflearn._05_stack_queue._06_공주_구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int a, int b){
        int p1 = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<a; i++){
            q.offer(i+1);
        }
        while (true) {
            p1++;
            if(p1==b) {
                q.poll();
                p1=0;
                if(q.size()==1){
                    break;
                }
            } else q.offer(q.poll());
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

//public class Main {
//    public int solution(int a, int b){
//        int answer = 0;
//        Queue<Integer> q = new LinkedList<>();
//        for(int i=0; i<a; i++){
//            q.offer(i+1);
//        }
//        while (!q.isEmpty()) {
//            for(int i=1; i<b; i++) q.offer(q.poll());
//            q.poll();
//            if(q.size()==1) answer=q.poll();
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(m.solution(a, b));
//    }
//}
