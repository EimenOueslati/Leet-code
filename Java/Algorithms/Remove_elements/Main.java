package Algorithms.Remove_elements;

import java.util.Arrays;

public class Main {
     public static void main(String[] args) {
        int[] test = {2,4,5,66,45,7,4,5,2,54,2,57,2,2,27,575,57,2,2,78,2};
        Solution sol = new Solution();
        System.out.println(sol.removeElement(test, 2));
        System.out.println(Arrays.toString(test));
    }

}
