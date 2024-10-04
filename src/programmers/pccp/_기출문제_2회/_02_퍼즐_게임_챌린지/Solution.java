package programmers.pccp._기출문제_2회._02_퍼즐_게임_챌린지;

class Solution {

    public boolean binarySearch(int level, int[] diffs, int[] times, long li){
        for(int i=0; i<diffs.length; i++){
            if(diffs[i]<=level) li-=times[i];
            else {
                int cnt = diffs[i]-level;
                li-=(cnt*(times[i] + times[i-1]) + times[i]);
            }
            if(li<0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int[] diffs, int[] times, long limit) {

        int p1=1;
        int p2=100000;
        int answer=p2;

        while(p1<=p2){
            long li = limit;
            int level = (p1+p2)/2;
            if(binarySearch(level, diffs, times, li)){
                answer=level;
                p2=level-1;
            }else{
                p1=level+1;
            }
        }

        return answer;
    }
}

//class Solution {
//    public int solution(int[] diffs, int[] times, long limit) {
//        int level = 1;
//        limit = limit - diffs[0]; // 28
//        long current;
//
//        while(true){
//            current=limit; // 28
//            for(int i=1; i<diffs.length; i++){ // 2번 호출
//                if(diffs[i]<=level) current-=times[i];
//                else {
//                    int cnt = diffs[i]-level; // 5-1=4;
//                    current-=(cnt*(times[i] + times[i-1]) + times[i]);
//                }
//                if(current<=0) {
//                    level++;
//                    break;
//                }
//            }
//            if(current>=0) break;
//        }
//
//        return level;
//    }
//}
