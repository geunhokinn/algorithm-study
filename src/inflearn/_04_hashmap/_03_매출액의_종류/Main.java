package inflearn._04_hashmap._03_매출액의_종류;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] a){

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        ans.add(map.size());

        for (int i = 0; i < n - k; i++) {
            map.put(a[i], map.get(a[i]) - 1);
            if (map.get(a[i]) == 0) {
                map.remove(a[i]);
            }

            if (!map.containsKey(a[k+i])) {
                map.put(a[k+i], 1);
            } else {
                map.put(a[k+i], map.get(a[k+i]) + 1);
            }

            ans.add(map.size());
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]= scanner.nextInt();
        }
        for(int i : m.solution(n, k, a)) {
            System.out.print(i + " ");
        }
    }
}