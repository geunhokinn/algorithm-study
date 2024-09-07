package inflearn._05_stack_queue._01_올바른_괄호;

import java.util.*;

public class Main {
    public String solution(String str){
        String ans = "YES";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    ans = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.empty()) ans = "NO";

        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(m.solution(str));
    }
}
