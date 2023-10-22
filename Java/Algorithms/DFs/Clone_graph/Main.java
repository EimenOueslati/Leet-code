package Algorithms.DFs.Clone_graph;

public class Main {
    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(4);
        Node n3 = new Node(3);
        Node n2 = new Node(2);
        Node root = new Node(1);
        root.neighbors.add(n2);
        n2.neighbors.add(root);
        root.neighbors.add(n3);
        n3.neighbors.add(root);
        n2.neighbors.add(n4);
        n4.neighbors.add(n2);
        n2.neighbors.add(n5);
        n5.neighbors.add(n2);
        Solution sol = new Solution();
        sol.cloneGraph(root);
    }
    
}