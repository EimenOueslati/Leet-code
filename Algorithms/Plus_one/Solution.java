package Algorithms.Plus_one;


/*
 * This class in the solution for the leetcode problem "Largest number at least twice the others":
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int[] ret = addOne(digits.length - 1, digits);
        return  ret;
    }

    private int[] addOne(int index, int[] digits)
    {
        if(digits[index] != 9)
        {
          digits[index]++;
          return digits;
        }else
        {
            if(index == 0)
            {
                int[] arr = new int[digits.length+1];
                System.arraycopy(digits, 0, arr, 1, digits.length);
                arr[1] = 0;
                arr[0] = 1;
                return arr;
            }else{
                digits[index] = 0;
                return addOne(index -1, digits);
            }
        }
    }
}
