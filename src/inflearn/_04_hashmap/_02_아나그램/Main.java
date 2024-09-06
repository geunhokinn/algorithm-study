package inflearn._04_hashmap._02_아나그램;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public String solution(String a, String b){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch1 : a.toCharArray()) {
            if (!map1.containsKey(ch1)) {
                map1.put(ch1, 1);
            } else {
                map1.put(ch1, map1.get(ch1) + 1);
            }
        }

        for (char ch2 : b.toCharArray()) {
            if (!map2.containsKey(ch2)) {
                map2.put(ch2, 1);
            } else {
                map2.put(ch2, map2.get(ch2) + 1);
            }
        }

        for (char ch : map1.keySet()) {
            if (!map1.get(ch).equals(map2.get(ch))) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(m.solution(a, b));
    }
}
