package inflearn._05_stack_queue._05_1_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str){
        int ans = 0;
        int n = str.length();
        char[] arr = str.toCharArray();
        Stack<Character> s = new Stack<>();
        for (int i=0; i<n; i++) {
            if(arr[i] == '(') s.push(arr[i]);
            else {
                s.pop();
                if(arr[i-1]=='(') {
                    ans += s.size();
                } else {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(m.solution(str));
    }
}
