package inflearn._05_stack_queue._04_후위식_연산;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str){
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) stack.push( ch -48);
            else {
                 int a = stack.pop();
                 int b = stack.pop();
                 if (ch == '+') stack.push(b+a);
                 else if (ch == '-') stack.push(b-a);
                 else if (ch == '/') stack.push(b/a);
                 else stack.push(b*a);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
