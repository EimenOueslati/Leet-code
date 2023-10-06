package Algorithms.DFs.Number_or_islands;

import java.util.Stack;

public class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Stack<int[]> st = new Stack<>();
        int[] pos;
        int islands=0;

         for(int i = 0; i < grid.length; i++)
         {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == '1' && !visited[i][j])
                {
                    st.add(new int[]{i,j});
                    while(!st.isEmpty())
                    {
                        pos = st.pop();
                        visited[pos[0]][pos[1]] = true;
                        if(i > 0 && !visited[i-1][j] && grid[i-1][j] == '1')
                        {
                            st.add(new int[]{i-1, j});
                        }
                        if(j < grid[0].length - 1 && !visited[i][j + 1] && grid[i][j + 1] == '1')
                        {
                            st.add(new int[]{i, j+1});
                        }
                        if(i < grid.length - 1 && !visited[i+1][j] && grid[i+1][j] == '1')
                        {
                            st.add(new int[]{i+1, j});
                        }
                        if(j > 0 && !visited[i][j - 1] && grid[i][j - 1] == '1')
                        {
                            st.add(new int[]{i, j-1});
                        }


                    }
                    islands++;

                }
            }
             
         }

        return islands;
    }

}
