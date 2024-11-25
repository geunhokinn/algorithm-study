package inflearn._04_hashmap._05_K번째_큰_수;

import java.util.*;

public class Main {
    public int solution(int a, int b, int[] arr){
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<a; i++){
            for(int j=i+1; j<a; j++){
                for(int l=j+1; l<a; l++){
                    set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        for(int x: set){
            cnt++;
            if(cnt==b) return x;
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(m.solution(a, b, arr));
    }
}
