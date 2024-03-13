package inflearn._10_dynamic_programming._04_가장_높은_탑_쌓기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick>{
    public int s, h, w;
    Brick(int s, int h, int w){
        this.s = s;
        this.h = h;
        this.w = w;
    }

    public int compareTo(Brick o){
        return o.s-this.s;
    }
}

public class Main {
    static int[] dy;
    public int solution(int n, ArrayList<Brick> arr){
        int answer = 0;
        dy = new int[arr.size()];
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        for(int i=1; i<arr.size(); i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr.get(j).w>arr.get(i).w && dy[j]>max) max=dy[j];
            }
            dy[i] = max + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            arr.add(new Brick(a, b, c));
        }
        System.out.println(m.solution(n, arr));
    }
}