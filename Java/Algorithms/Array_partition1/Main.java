package Algorithms.Array_partition1;

/*
 * This class in the solution for the leetcode problem "Add Binary":
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that
 *  the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 * 
 * Constraints:
 * 1 <= n <= 104
 * nums.length == 2 * n
 * -104 <= nums[i] <= 104
 */
public class Main {
    public static void main(String[] args) {
        int[] test = {6,2,6,5,1,2};
        Solutiuon sol = new Solutiuon();
        System.out.println(sol.arrayPairSum(test));
    }
}
