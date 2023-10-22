package Algorithms.Spiral_matrix;

public class Main {
    public static void main(String[] args) {
        int[][] test = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        Solution sol = new Solution();
        System.out.println(sol.spiralOrder(test));
    }   
}
