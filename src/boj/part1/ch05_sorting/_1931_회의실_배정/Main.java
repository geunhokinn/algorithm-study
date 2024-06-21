package boj.part1.ch05_sorting._1931_회의실_배정;

import java.util.Arrays;
import java.util.Scanner;

class Meeting {
    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
    int start;
    int end;
}

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++)
            meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());

        Arrays.sort(meetings, (o1, o2) -> {
            if (o1.end == o2.end)
                return o1.start - o2.start;
            return o1.end - o2.end;
        });

        int cnt = 0, ended = 0;
        for (int i = 0; i < n; i++)
            if (ended <= meetings[i].start) {
                cnt++;
                ended = meetings[i].end;
            }
        System.out.println(cnt);
    }
}