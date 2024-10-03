package programmers.pccp._기출문제_1회._01_붕대_감기;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int current=health;
        int conti=0;
        int idx=0;
        for(int i=1; i<=attacks[attacks.length-1][0]; i++){
            if(i==attacks[idx][0]){
                current-=attacks[idx][1];
                idx++;
                conti=0;
                if(current<=0) break;
            }else{
                conti++;
                current+=bandage[1];
                if(conti==bandage[0]){
                    conti=0;
                    current+=bandage[2];
                }
                if(health<=current) current=health;
            }
        }
        if(current<=0) return -1;
        else return current;
    }
}
