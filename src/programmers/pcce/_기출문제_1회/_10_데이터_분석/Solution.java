package programmers.pcce._기출문제_1회._10_데이터_분석;

import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int ext_idx;
        int sort_idx;
        ArrayList<int[]> arr = new ArrayList<>();

        if (ext.equals("code")) {
            ext_idx = 0;
        } else if (ext.equals("date")) {
            ext_idx = 1;
        } else if (ext.equals("maximum")) {
            ext_idx = 2;
        } else {
            ext_idx = 3;
        }

        int len = data.length;
        for(int i=0; i<len; i++) {
            if(data[i][ext_idx] < val_ext) {
                arr.add(data[i]);
            }
        }

        int[][] ans = new int[arr.size()][4];

        for(int i=0; i<arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        if (sort_by.equals("code")) {
            sort_idx = 0;
        } else if (sort_by.equals("date")) {
            sort_idx = 1;
        } else if (sort_by.equals("maximum")) {
            sort_idx = 2;
        } else {
            sort_idx = 3;
        }

        Arrays.sort(ans, (o1,o2) -> o1[sort_idx]-o2[sort_idx]);

        return ans;
    }
}
