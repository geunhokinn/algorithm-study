package inflearn._10_dynamic_programming._04_1_가장_높은_탑_쌓기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    int s;
    int h;
    int w;

    Brick (int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s-this.s;
    }
}

public class Main {
    static int[] dy;
    public int solution(int n, ArrayList<Brick> arr){
        Collections.sort(arr);
        dy = new int[n];
        dy[0] = arr.get(0).h;
        int ans = 0;
        for(int i=1; i<n; i++) {
            dy[i] = arr.get(i).h;
            for(int j=0; j<i; j++) {
                if(arr.get(i).w < arr.get(j).w && dy[i] < dy[j] + arr.get(i).h) {
                    dy[i] = dy[j] + arr.get(i).h;
                }
            }
            if(ans<dy[i]) ans=dy[i];
        }
        return ans;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int s = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Brick(s, h, w));
        }
        System.out.println(m.solution(n, arr));
    }
}