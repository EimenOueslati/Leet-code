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
    
    private int findPiv(int index, int sumLeft, int sumRight, int[] arr)
    {
        if(index + 1 < arr.length)
        {
            if(sumLeft == sumRight) return index;
            else return findPiv(index + 1, sumLeft + arr[index + 1], sumRight - arr[index + 1], arr);
        }else if(sumLeft == arr[index])
        {
            return index;
        }else
        {
            return -1;
        }

    }
}
