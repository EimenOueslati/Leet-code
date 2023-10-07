package Algorithms.BFS.Target_sum;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        if(nums.length == 0) return 0;
        int combinations = 0;
        Queue<Integer> q = new LinkedList<>();
        if(nums[0] == target) combinations++;
        if(-nums[0] == target) combinations++;
        q.add(nums[0]);
        q.add(-nums[0]);
        for(int i = 1; i < nums.length; i++)
        {
            
            for(int j = 0; j < i*2; j++)
            {
                int curr = q.poll();
                int elem1 = curr + nums[i];
                int elem2 = curr - nums[i];
                if(elem1 == target) combinations++;
                if(elem2 == target) combinations++;
                q.add(elem1);
                q.add(elem2);
            }
        }
        return combinations;
    }
}
