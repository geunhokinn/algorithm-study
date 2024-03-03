package inflearn._05_stack_queue._07_교육과정_설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String a, String b){
        Queue<Character> q = new LinkedList<>();
        for(char c : a.toCharArray()) q.offer(c);
        for(char c : b.toCharArray()){
            if(q.contains(c)){
                if(q.poll()!=c) return "NO";
            }
        }
        if(!q.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(m.solution(a, b));
    }
}