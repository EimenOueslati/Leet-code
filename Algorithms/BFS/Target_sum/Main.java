package Algorithms.BFS.Target_sum;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,0,0,0,0,0,1};
        int target = 1;
        Solution sol = new Solution();
        System.out.println(sol.findTargetSumWays(arr, target));
    }
    
}
