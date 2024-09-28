package programmers.pccp._모의고사_1회._01_외톨이_알파벳;

import java.util.*;

class Solution {
    public String solution(String input_string) {

        ArrayList<Character> al = new ArrayList<>();
        Stack<Character> tmp = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] arr = input_string.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if(tmp.contains(arr[i])) {
                if(al.contains(arr[i])) continue;
                if(arr[i-1] != arr[i]) al.add(arr[i]);
            } else {
                tmp.push(arr[i]);
            }
        }

        if (!al.isEmpty()) {
            Collections.sort(al);
            for(int i=0; i<al.size(); i++) {
                sb.append(String.valueOf(al.get(i)));
            }
            return String.valueOf(sb);
        } else {
            return "N";
        }
    }
}
