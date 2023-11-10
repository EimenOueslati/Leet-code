package Algorithms.Max_consecutive_ones;

public class Main {
    public static void main(String[] args) {
        int[] test = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        Solution sol = new Solution();
        System.out.println(sol.findMaxConsecutiveOnes(test));
    }
}
