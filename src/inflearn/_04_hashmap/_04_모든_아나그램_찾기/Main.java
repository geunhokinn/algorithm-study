package inflearn._04_hashmap._04_모든_아나그램_찾기;

import java.util.*;

public class Main {
    public int solution(String a, String b){
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        for(char c : bArr) bm.put(c, bm.getOrDefault(c, 0)+1);
        int p1 = 0, p2 = bArr.length-1, n = aArr.length, answer = 0;
        while(p2<n) { // 2 9
            am.put(aArr[p1], am.getOrDefault(aArr[p1], 0)+1);
            if(p1==p2){
                if(am.equals(bm)) answer += 1;
                p2++; // 3
                am.put(aArr[p2-b.length()], am.get(aArr[p2-b.length()])-1);
                if(am.get(aArr[p2-b.length()])==0) am.remove(aArr[p2-b.length()]);
                p1 = p2-1; // 2
            }
            p1++; // 3
        }

        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.print(m.solution(a, b));
    }
}
