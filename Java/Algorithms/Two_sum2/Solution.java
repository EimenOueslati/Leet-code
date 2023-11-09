package Algorithms.Two_sum2;




/*
 * This class is the solution for the leetcode problem "Spiral matrix":
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * Your solution must use only constant extra space.
 * 
 * Constraints:
 * 2 <= numbers.length <= 3 * 104
 * -1000 <= numbers[i] <= 1000
 * numbers is sorted in non-decreasing order.
 * -1000 <= target <= 1000
 * The tests are generated such that there is exactly one solution.
 */
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
