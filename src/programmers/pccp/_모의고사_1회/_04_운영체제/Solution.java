package programmers.pccp._모의고사_1회._04_운영체제;

import java.util.*;

class Solution {

    class Program implements Comparable<Program> {
        int score;
        int startTime;
        int runTime;

        Program(int score, int startTime, int runTime) {
            this.score = score;
            this.startTime = startTime;
            this.runTime = runTime;
        }

        @Override
        public int compareTo(Program o) {
            if(this.score==o.score) return this.startTime-o.startTime;
            else return this.score-o.score;
        }
    }

    public long[] solution(int[][] program) {
        // 0 프로그램 종료 시각 // 1~10 점수가 i인 프로그램들의 대기시간 합
        long[] answer = new long[11];

        ArrayList<Program> arr = new ArrayList<>();
        for(int[] i : program) {
            arr.add(new Program(i[0], i[1], i[2]));
        }

        // start 오름차순 정렬, 시작시간이 같으면 점수순으로 정렬
        Collections.sort(arr, (a, b) -> {
            if(a.startTime==b.startTime) return a.score-b.score;
            else return a.startTime-b.startTime;
        });

        // score 가 낮은 것부터 실행
        PriorityQueue<Program> pq = new PriorityQueue<>();

        int currentTime=0; // 현재 시각
        int idx=0; // program 배열의 idx
        while(!pq.isEmpty() || idx < arr.size()) {

            // pq 에 시작시간이 작은것부터 넣기
            while(idx < arr.size() && arr.get(idx).startTime <= currentTime) {
                pq.offer(arr.get(idx));
                idx++;
            }

            // 대기열에 있는 프로그램 중 하나를 실행
            if(!pq.isEmpty()) {
                Program cur = pq.poll();
                answer[cur.score] += currentTime - cur.startTime; // 대기 시간 추가
                currentTime += cur.runTime; // 프로그램 실행 후 시간 증가
            } else {
                currentTime = arr.get(idx).startTime; // // 대기열이 비었으면 다음 프로그램 호출 시간까지 이동
            }

        }

        // 모든 프로그램 종료 후 전체 종료 시각 저장
        answer[0] = currentTime;
        return answer;
    }
}
