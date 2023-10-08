package Algorithms.BFS.Target_sum;
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
