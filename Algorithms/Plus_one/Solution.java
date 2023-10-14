package Algorithms.Plus_one;

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
