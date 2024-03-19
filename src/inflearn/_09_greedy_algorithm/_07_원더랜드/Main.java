package inflearn._09_greedy_algorithm._07_원더랜드;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    public int v1;
    public int v2;
    public int cost;
    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
    public int compareTo(Edge o){
        return this.cost-o.cost;
    }
}

public class Main {
    static int[] unf;
    public static int find(int v){
        if(v==unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }
    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa!=fb) unf[fa] = fb;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        unf = new int[n+1];
        ArrayList<Edge> arr = new ArrayList<>();
        for(int i=1; i<=n; i++) unf[i]=i;
        for(int i=0; i<m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            arr.add(new Edge(a, b, c));
        }
        int answer = 0;
        Collections.sort(arr);
        for(Edge o : arr){
            int fv1 = find(o.v1);
            int fv2 = find(o.v2);
            if(fv1!=fv2){
                answer += o.cost;
                union(o.v1, o.v2);
            }
        }
        System.out.println(answer);
    }
}