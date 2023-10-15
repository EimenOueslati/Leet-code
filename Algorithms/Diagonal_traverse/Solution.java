package Algorithms.Diagonal_traverse;

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] asnwer = new int[mat.length * mat[0].length];
        trverseDiag(0,mat,true);
        return asnwer;
    }

    
}
