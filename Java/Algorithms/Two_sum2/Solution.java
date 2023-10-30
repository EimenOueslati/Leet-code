package Algorithms.Two_sum2;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++)
        {
            int temp = binSearch(numbers, numbers[i], target);
            if( temp != -1) return new int[]{i + 1, temp + 1};
        }
        return null;
    }

    private int binSearch(int[] arr, int i, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int curr = arr.length/2;
        while(start != end)
        {
            if(arr[curr] + i ==  target) return curr;
            else if(arr[curr] + i < target)
            {
                start = curr;
                curr = (start + end) / 2;
            }
            else
            {
                end = curr;
                curr = (start + end) / 2;
            }
        }
        return -1;
    }
}
