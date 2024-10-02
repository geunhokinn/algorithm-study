package programmers.pccp._모의고사_2회._03_카페_확장;

import java.util.*;

class Solution {
    public int solution(int[] menu, int[] order, int k) {
        int answer = 0;
        int currentTime = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<order.length; i++) {
            int arrivalTime = i * k;

            while(!queue.isEmpty() && queue.peek() <= arrivalTime) {
                queue.poll();
            }

            currentTime = Math.max(currentTime, arrivalTime);
            currentTime += menu[order[i]];
            queue.offer(currentTime);

            answer = Math.max(answer, queue.size());
        }
        return answer;
    }
}