package Algorithms.Array_partition1;

import java.util.Arrays;

public class Solutiuon {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); 
        int answer = 0;
        for(int i = 0; i < nums.length / 2; i += 2)
        {
            answer += nums[i];
        }
        return answer;
    }
}
