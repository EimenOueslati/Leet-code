package Algorithms.Largest_number_at_least_twice_of_others;

/*
 * This class in the solution for the leetcode problem "Largest number at least twice the others":
 * You are given an integer array nums where the largest integer is unique.
 * Determine whether the largest element in the array is at least twice as much
 *  as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 * 
 * Constraints:
 * 2 <= nums.length <= 50
 * 0 <= nums[i] <= 100
 * The largest element in nums is unique.
 */
public class Solution {
    public int dominantIndex(int[] nums) {
        int largest = 0;
        int index = 0;
        for(int i : nums)
        {
            if(i > nums[largest]) largest = index;
            index++;
        }
        index = 0;
        for(int i : nums)
        {
            if( index == largest)
            {
                index++;
                continue;
            } 
            else if(nums[largest] < i * 2) return -1;
            index++;
        }
        return largest;
    }
}
