package Algorithms.Inorder_tree_traversal;

import java.util.LinkedList;
import java.util.List;

/*
 * This class in the solution for the leetcode proble "Binary tree inorder traversal":
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.Constraints: 
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class Solution {
    List<Integer> ret = new LinkedList<>();
     public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return ret;
        traversTree(root);
        return ret;
        
    }

    private void traversTree(TreeNode node)
    {

        if(node.left != null) traversTree(node.left);
        ret.add(node.val);
        if(node.right != null) traversTree(node.right);
    }
}

