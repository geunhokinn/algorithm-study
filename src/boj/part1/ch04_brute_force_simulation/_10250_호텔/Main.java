package boj.part1.ch04_brute_force_simulation._10250_호텔;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int floor = (n-1) % h + 1; // (10-1) % 6+1 = 4
            int distance = (n-1) / h + 1; // (10-1) / 6 + 1 = 1

            System.out.printf("%d%02d%n", floor, distance);
        }

    }
}