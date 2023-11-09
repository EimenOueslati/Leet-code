package Algorithms.Two_sum2;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        int result;
        for(int i = 0; i < numbers.length; i ++)
        {
            result = numbers[index1] + numbers[index2] ;
            if(result == target) return new int[]{index1+1, index2+1};
            if(result > target) index2--;
            else index1++;

        }
       return null;
    }
}
