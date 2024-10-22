package inflearn._02_array._08_등수_구하기;

import java.util.Scanner;

public class Main {

    public int[] solution(int num, String str){
        String[] sa = str.split(" ");
        int[] answer = new int[num];
        for(int i=0; i<num; i++){
            int cnt = 1;
            for(int j=0; j<num; j++){
                if(Integer.valueOf(sa[i])<Integer.valueOf(sa[j])){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        for(int i : m.solution(num, str)){
            System.out.print(i+" ");
        }
    }
}