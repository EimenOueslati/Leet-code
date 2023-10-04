package Algorithms.Daily_temp;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] answer = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++)
        {
            int period = 0;
            for(int j = i + 1; j < temperatures.length; j++)
            {
                if(temperatures[i] < temperatures[j])
                {
                    answer[i] = ++period;
                    break;
                }
                period++;

            }
            if(period == 0) answer[i] = 0;
        }

        return answer;
    }
    
    
}
