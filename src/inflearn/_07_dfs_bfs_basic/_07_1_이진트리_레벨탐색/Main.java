package inflearn._07_dfs_bfs_basic._07_1_이진트리_레벨탐색;

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
    public void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 1;
        while(!q.isEmpty()) {
            System.out.print(L + " : ");
            int size = q.size();
            for (int i=0; i<size; i++) {
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) q.offer(cur.lt);
                if (cur.rt != null) q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}