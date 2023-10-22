package Algorithms.BFS.Target_sum;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1};
        int target = 3;
        Solution sol = new Solution();
        System.out.println(sol.findTargetSumWays(arr, target));
    }
    
}
