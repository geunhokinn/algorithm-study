package inflearn._05_stack_queue._02_괄호문자제거;

import java.util.*;

public class Main {
    public ArrayList<Character> solution(String str){
        ArrayList<Character> arr = new ArrayList<>();
        Stack<Character> s = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                s.pop();
            } else if (s.isEmpty()) {
                arr.add(ch);
            }
        }

        return arr;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (char ch : m.solution(str)) {
            System.out.print(ch);
        }
    }
}