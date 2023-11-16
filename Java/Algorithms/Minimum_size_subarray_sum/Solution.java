package Algorithms.Minimum_size_subarray_sum;

import java.util.Arrays;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr = Integer.MAX_VALUE;
        int[] temp;
        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i + 1; j <  nums.length + 1; j++)
            {
                temp = Arrays.copyOfRange(nums, i, j);
                if(sumarray(temp) == target && temp.length < curr) curr = temp.length;
            }
        }
        return curr == Integer.MAX_VALUE ? 0 : curr;
    }

    private int sumarray(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i <arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
}
