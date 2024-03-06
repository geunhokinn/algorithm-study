package inflearn._06_sorting_and_searching._08_이분_검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int a, int b, int[] arr){
        int answer = 0, p1 = 0, p2 = a-1;;
        Arrays.sort(arr);
        while(p1<=p2){
            int mid = (p1+p2)/2;
            if(arr[mid]==b){
                answer = mid+1;
                break;
            } else if (arr[mid]>b) {
                p2 = mid - 1;
            } else {
                p1 = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++) arr[i] = scanner.nextInt();
        System.out.println(m.solution(a, b, arr));
    }
}