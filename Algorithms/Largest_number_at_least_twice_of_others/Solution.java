package Algorithms.Largest_number_at_least_twice_of_others;

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
