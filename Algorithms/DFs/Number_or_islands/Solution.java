package Algorithms.DFs.Number_or_islands;

import java.util.Stack;

/*
 * This class in the solution for the leetcode proble "Numbre of islands":
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * 
 * Constraints:
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'.
 */
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
