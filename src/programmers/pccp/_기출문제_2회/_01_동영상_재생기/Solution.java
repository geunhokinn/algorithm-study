package programmers.pccp._기출문제_2회._01_동영상_재생기;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        String[] video_len_s=video_len.split(":");
        String[] pos_s=pos.split(":");
        String[] op_start_s=op_start.split(":");
        String[] op_end_s=op_end.split(":");

        int video_r, pos_r, op_start_r, op_end_r;

        video_r = Integer.valueOf(video_len_s[0]) * 60 + Integer.valueOf(video_len_s[1]);
        pos_r = Integer.valueOf(pos_s[0]) * 60 + Integer.valueOf(pos_s[1]);
        op_start_r = Integer.valueOf(op_start_s[0]) * 60 + Integer.valueOf(op_start_s[1]);
        op_end_r = Integer.valueOf(op_end_s[0]) * 60 + Integer.valueOf(op_end_s[1]);

        if(pos_r >= op_start_r && pos_r <= op_end_r) {
            pos_r = op_end_r;
        }
        for(int i=0; i<commands.length; i++){
            if(commands[i].equals("next")){
                pos_r += 10;
                if(pos_r>video_r) pos_r=video_r;
            }else{
                pos_r -= 10;
                if(pos_r<0) pos_r=0;
            }
            if(pos_r >= op_start_r && pos_r <= op_end_r) {
                pos_r = op_end_r;
            }
        }

        int m = pos_r / 60;
        String m_s;
        if(m==0) m_s="00";
        else if(m<10) m_s="0"+String.valueOf(m);
        else m_s=String.valueOf(m);

        int s = pos_r % 60;
        String s_s;
        if(s==0) s_s="00";
        else if(s<10) s_s="0"+String.valueOf(s);
        else s_s=String.valueOf(s);

        return m_s+":"+s_s;
    }
}
