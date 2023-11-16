package Algorithms.Minimum_size_subarray_sum;

import java.util.Arrays;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        return 0;
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
