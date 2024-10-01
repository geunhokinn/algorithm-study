package programmers.pccp._모의고사_2회._02_신입사원_교육;

import java.util.*;

class Solution {
    public int solution(int[] ability, int number) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : ability) {
            pq.offer(i);
        }

        for(int i=0; i<number; i++) {
            int a = pq.poll();
            int b = pq.poll();
            int tmp = a + b;
            pq.offer(tmp);
            pq.offer(tmp);
        }

        for(int i : pq){
            answer+=i;
        }

        return answer;
    }
}

//class Solution {
//    public int solution(int[] ability, int number) {
//        int answer = 0;
//
//        for(int i=0; i<number; i++){
//            Arrays.sort(ability);
//            int tmp = ability[0]+ability[1];
//            ability[0]=tmp;
//            ability[1]=tmp;
//        }
//
//        for(int i : ability){
//            answer+=i;
//        }
//
//        return answer;
//    }
//}