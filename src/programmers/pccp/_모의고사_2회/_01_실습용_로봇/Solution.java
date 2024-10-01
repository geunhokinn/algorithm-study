package programmers.pccp._모의고사_2회._01_실습용_로봇;

class Solution {
    public int[] solution(String command) {
        int[] answer = new int[2];

        int dic = 1;
        int x=0;
        int y=0;
        for (char ch : command.toCharArray()) {

            if(ch=='G') {
                if(dic==1) {
                    y++;
                }else if(dic==-1){
                    y--;
                }else if(dic==2){
                    x++;
                }else x--;
            }else if(ch=='B'){
                if(dic==1) {
                    y--;
                }else if(dic==-1){
                    y++;
                }else if(dic==2){
                    x--;
                }else x++;
            }else if(ch=='R'){
                if(dic==1){
                    dic=2;
                }else if(dic==2){
                    dic=-1;
                }else if(dic==-1){
                    dic=-2;
                }else dic=1;
            }else{
                if(dic==1){
                    dic=-2;
                }else if(dic==2){
                    dic=1;
                }else if(dic==-1){
                    dic=2;
                }else dic=-1;
            }

        }

        answer[0]=x;
        answer[1]=y;
        return answer;
    }
}
