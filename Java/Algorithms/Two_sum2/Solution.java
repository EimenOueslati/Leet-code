package Algorithms.Two_sum2;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int x;
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[i] + numbers[j] == target) 
                {
                    ret = new int[]{i + 1, j + 1};
                }
            }
        }
        
        return ret;
    }
}
