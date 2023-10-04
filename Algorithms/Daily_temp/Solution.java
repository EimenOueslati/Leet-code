package Algorithms.Daily_temp;

import java.util.Stack;

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
                        //tempInd[0] = temperatures[i];
                        //tempInd[1] = i;
                        st.add(tempInd); 
                        break;
                    }
                }else{
                    answer[i] = 0;
                    tempInd = new int[]{temperatures[i],i};
                    //tempInd[0] = temperatures[i];
                    //tempInd[1] = i;
                    st.add(tempInd); 
                    break;
                }

            }
                
        }



        return answer;
    }
}
