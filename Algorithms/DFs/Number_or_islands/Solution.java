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
                    islands++;
                    while(!st.isEmpty())
                    {
                        
                        pos = st.pop();
                        visited[pos[0]][pos[1]] = true;
                        if(pos[0] > 0 && !visited[pos[0]-1][pos[1]] && grid[pos[0]-1][pos[1]] == '1')
                        {
                            st.add(new int[]{pos[0]-1, pos[1]});
                        }
                        if(pos[1] < grid[0].length - 1 && !visited[pos[0]][pos[1] + 1] && grid[pos[0]][pos[1] + 1] == '1')
                        {
                            st.add(new int[]{pos[0], pos[1]+1});
                        }
                        if(pos[0] < grid.length - 1 && !visited[pos[0]+1][pos[1]] && grid[pos[0]+1][pos[1]] == '1')
                        {
                            st.add(new int[]{pos[0]+1, pos[1]});
                        }
                        if(pos[1] > 0 && !visited[pos[0]][pos[1] - 1] && grid[pos[0]][pos[1] - 1] == '1')
                        {
                            st.add(new int[]{pos[0], pos[1]-1});
                        }


                    }
                    

                }
            }
             
         }

        return islands;
    }

}
