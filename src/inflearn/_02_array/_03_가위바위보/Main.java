package inflearn._02_array._03_가위바위보;

import java.util.Scanner;

public class Main {
    public String solution(int num, int[] ia1, int[] ia2){

        String ans = "";

        for (int i = 0; i < num; i++) {
            if (ia1[i] == 1 & ia2[i] == 3) ans += "A";
            else if (ia1[i] == 2 & ia2[i] == 1) ans += "A";
            else if (ia1[i] == 3 & ia2[i] == 2) ans += "A";
            else if (ia1[i] == ia2[i]) ans += "D";
            else ans += "B";
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] ia1 = new int[num];
        int[] ia2 = new int[num];
        for(int i=0; i<num; i++){
            ia1[i] = scanner.nextInt();
        }
        for(int i=0; i<num; i++){
            ia2[i] = scanner.nextInt();
        }

        for(char c : m.solution(num, ia1, ia2).toCharArray()){
            System.out.println(c);
        }
    }
}
