package Algorithms.OI_matrix;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] ret = new int[mat.length][mat[0].length];
        Queue<int[]> st = new LinkedList<>();
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                int steps = 0;
                st.clear();
                st.add(new int[]{i,j});
                while(!st.isEmpty())
                {
                    int size = st.size();
                    while(size > 0)
                    {
                        int x = st.peek()[0];
                        int y = st.peek()[1];
                        if(mat[x][y] == 0) 
                        {
                            ret[i][j] = steps;
                            st.clear();
                            break;
                        }
                        if(x > 0) st.add(new int[]{x - 1,y});
                        if (y < mat[0].length - 1) st.add(new int[]{x ,y + 1});
                        if(x < mat.length - 1) st.add(new int[]{x + 1, y});
                        if(y > 0) st.add(new int[]{x,y - 1});
                        st.poll();
                        size--;
                    }
                    steps++;
                }
            }
        }
        return ret;
    } 
}
