package Algorithms.BFS.Target_sum;

import java.util.LinkedList;
import java.util.Queue;

/*
 * This class in the solution for the leetcode proble "Target sum":
 * You are given an integer array nums and an integer target.
 * You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
 * For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
 * Return the number of different expressions that you can build, which evaluates to target.
 * 
 * Constraints:
 * 1 <= nums.length <= 20
 * 0 <= nums[i] <= 1000
 * 0 <= sum(nums[i]) <= 1000
 * -1000 <= target <= 1000
 */
public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int arrlen = nums.length;
        if(arrlen == 0) return 0;
        int combinations = 0;
        if(arrlen== 1 && (nums[0] == target || -nums[0] == target)) return 1;
        if(arrlen == 1 && (nums[0] != target || -nums[0] != target)) return 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(nums[0]);
        q.add(-nums[0]);
        int elem1, elem2, curr;
        for(int i = 1; i < arrlen - 1; i++)
        {
            int iterations = (int) Math.pow(2, i);
            for(int j = 0; j < iterations; j++)
            {
                curr = q.poll();
                elem1 = curr + nums[i];
                elem2 = curr - nums[i];
                if(i == arrlen - 2)
                {
                    if(elem1 + nums[i + 1] == target) combinations++;
                    if(elem1 - nums[i + 1] == target) combinations++;
                    if(elem2 + nums[i + 1] == target) combinations++;
                    if(elem2 - nums[i + 1] == target) combinations++;
                }else{
                    q.add(elem1);
                    q.add(elem2);
                }
                
            }
        }
        return combinations;
    }
}
