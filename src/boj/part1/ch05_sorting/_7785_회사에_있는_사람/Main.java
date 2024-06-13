package boj.part1.ch05_sorting._7785_회사에_있는_사람;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> entered = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String record = sc.next();
            if (record.equals("enter")) entered.add(name);
            else entered.remove(name);
        }

        String[] answer = entered.toArray(new String[entered.size()]);
        for (int i = answer.length - 1; i >= 0; i--)
            System.out.println(answer[i]);
    }
}
