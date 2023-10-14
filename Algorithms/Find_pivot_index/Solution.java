package Algorithms.Find_pivot_index;


/*
 * This class in the solution for the leetcode problem "Find pivot index":
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 * 
 * Constraints:
 * 1 <= nums.length <= 104
 * -1000 <= nums[i] <= 1000
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        int sumRight = 0;
        for(int i : nums)
        {
            sumRight += i;
        }
        if(sumRight - nums[0] == 0) return 0;
        int ret = findPiv(1,nums[0], sumRight - (nums[0] + nums[1]), nums);
        return ret;
    }
    
    private int findPiv(int index, int sumLeft, int sumRight, int[] arr)
    {
        if(index + 1 < arr.length)
        {
            if(sumLeft == sumRight) return index;
            else return findPiv(index + 1, sumLeft + arr[index], sumRight - arr[index + 1], arr);
        }else if(sumLeft == 0)
        {
            return index;
        }else
        {
            return -1;
        }

    }
}
