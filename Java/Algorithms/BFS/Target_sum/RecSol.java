package Algorithms.BFS.Target_sum;

/*
 * This class in the solution for the leetcode proble "Target sum":
 * You are given an integer array nums and an integer target.
 * You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
 * For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
 * Return the number of different expressions that you can build, which evaluates to target.
 * 
 * Constraints:
 * 1 <= nums.length <= 20
 * 0 <= nums[i] <= 1000
 * 0 <= sum(nums[i]) <= 1000
 * -1000 <= target <= 1000
 */
public class RecSol {
    private int arrlen;
    private int targ;
    private int combinations = 0;
    public int findTargetSumWays(int[] nums, int target) {
        arrlen = nums.length;
        targ = target;
        int sum = 0;
        for(int i : nums)
        {
            sum += i;
        }
        if(sum < Math.abs(target) || (sum + target) % 2 == 1) return 0;
        recTS(0, 0, nums);
        return combinations;
    }

    private void recTS(int index, int sum, int[] nums)
    {
        if(index == arrlen - 1)
        {
            if(sum + nums[index] == targ) combinations++;
            if(sum - nums[index] == targ) combinations++;
            return;
        }

        recTS(index + 1, sum + nums[index], nums);
        recTS(index+ 1, sum - nums[index], nums);
    }

}
