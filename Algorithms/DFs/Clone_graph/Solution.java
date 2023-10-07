package Algorithms.DFs.Clone_graph;
import java.util.HashMap;

public class Solution {
    public Node cloneGraph(Node node) {
       Node root = new Node(node.val);
       HashMap<Node, Node> map = new HashMap<>();
       map.put(node, root);
       recClone(node, map);
       return root;
    }


    private void recClone(Node original, HashMap<Node, Node> map)
    {
        if(!map.containsKey(original)) map.put(original, new Node(original.val));
        for(int i = 0; i < original.neighbors.size(); i++)
        {
            if(!map.containsKey(original.neighbors.get(i))) recClone(original.neighbors.get(i), map);
            
        }

         for(int i = 0; i < original.neighbors.size(); i++)
         {
            map.get(original).neighbors.add(map.get(original.neighbors.get(i)));
         }

    }
    
}