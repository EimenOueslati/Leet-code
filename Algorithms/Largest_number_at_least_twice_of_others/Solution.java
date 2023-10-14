package Algorithms.Largest_number_at_least_twice_of_others;

public class Solution {
    public int dominantIndex(int[] nums) {
        int largest = 0;
        int secondLatgest = -1;
        int currInd = 0;
        for(int i : nums)
        {
            if(i > nums[largest])
            {
                secondLatgest = largest;
                largest = currInd;
                currInd++;
            }
        }

        if(secondLatgest == -1) return -1;
        else if(nums[largest] >= nums[secondLatgest] *2) return largest;
        else return -1;
    }
}
