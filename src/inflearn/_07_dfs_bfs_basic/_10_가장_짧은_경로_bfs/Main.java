package inflearn._07_dfs_bfs_basic._10_가장_짧은_경로_bfs;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt,rt;
    public Node(int val) {
        data=val;
        lt=rt=null;
    }
}

public class Main {
    Node root;
    public int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L=0;
        while(!q.isEmpty()){
           int len = q.size();
           for(int i=0; i<len; i++){
               Node cur = q.poll();
               if(cur.lt==null && cur.rt==null) return L;
               if(cur.lt!=null) q.offer(cur.lt);
               if(cur.rt!=null) q.offer(cur.rt);
           }
           L++;
        }
        return 1;
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}