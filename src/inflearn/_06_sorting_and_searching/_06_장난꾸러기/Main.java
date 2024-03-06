package inflearn._06_sorting_and_searching._06_장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<tmp.length; i++){
            if(tmp[i]!=arr[i]) answer.add(i+1);
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
        for(int i : m.solution(n, arr)) System.out.print(i+" ");
    }
}

//public class Main {
//    public int[] solution(int n, int[] arr){
//        int[] answer = new int[2];
//        int p=0, tmp=1;
//        for(int i=0; i<n-1; i++) {
//            if(arr[i]>arr[i+1]) answer[p++] = i+tmp++;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main m = new Main();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
//        for(int i : m.solution(n, arr)) System.out.print(i+" ");
//    }
//}