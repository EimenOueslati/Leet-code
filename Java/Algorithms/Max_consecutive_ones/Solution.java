package Algorithms.Max_consecutive_ones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currMax = 0;
        int currentCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                if(currentCount > currMax)
                {
                    currMax = currentCount;
                }
                currentCount = 0;
            }
            else
            {
                currentCount++;
            }
            
        }
        return currMax;
    }
    
}
