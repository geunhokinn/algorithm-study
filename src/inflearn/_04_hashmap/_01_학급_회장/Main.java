package inflearn._04_hashmap._01_학급_회장;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public char solution(int n, String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        int max = 0;
        char ans = ' ';
        for (char key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(m.solution(n, str));
    }
}
