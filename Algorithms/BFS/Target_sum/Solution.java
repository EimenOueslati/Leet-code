package Algorithms.BFS.Target_sum;

import java.util.LinkedList;
import java.util.Queue;

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
