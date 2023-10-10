package Algorithms.Flood_fill;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(sol.floodFill(arr, 1, 1, 2));
    }
}
