package Algorithms.Daily_temp;

import java.util.Stack;

/*
 * This class in the solution for the leetcode problem "Daily temperatures":
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.

 */
public class Solution {
public int[]  dailyTemperatures(int[] temperatures){
        int [] answer = new int[temperatures.length];
        Stack<int[]> st = new Stack<>();
        int[] tempInd = new int[] {temperatures[temperatures.length - 1], temperatures.length-1};
        
        for(int i = temperatures.length - 1; i >= 0; i --)
        {
            while(true)
            {
                if(!st.isEmpty())
                {
                    if(st.peek()[0] <= temperatures[i])
                    {
                        st.pop();
                    }else{
                        answer[i] = st.peek()[1] - i;
                        tempInd = new int[]{temperatures[i],i};
                        st.add(tempInd); 
                        break;
                    }
                }else{
                    answer[i] = 0;
                    tempInd = new int[]{temperatures[i],i};
                    st.add(tempInd); 
                    break;
                }
            }        
        }
        return answer;
    }
}
