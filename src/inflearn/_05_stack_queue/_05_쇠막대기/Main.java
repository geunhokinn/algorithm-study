package inflearn._05_stack_queue._05_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str){
        int answer = 0;
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') s.push('(');
            else {
                s.pop();
                if(str.charAt(i-1)=='(') answer+=s.size();
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(m.solution(str));
    }
}
