package inflearn._02_array._05_소수;

import java.util.Scanner;

public class Main {
    public int solution(int num){
        int answer=0;
        int[] ch = new int[num+1];
        for(int i=2; i<=num; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=num; j=j+i){
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(m.solution(num));
    }
}
