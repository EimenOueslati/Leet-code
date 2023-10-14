package Algorithms.Find_pivot_index;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sumRight = 0;
        for(int i : nums)
        {
            sumRight += i;
        }
        if(sumRight - nums[0] == nums[0]) return 0;
        int ret = findPiv(1,nums[0], sumRight - nums[0], nums);
        return ret;
    }
    
}
