package Algorithms.BFS.Number_of_islands;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public int numIslands(char[][] grid) {
        int dim1 = grid.length;
        int dim2 = grid[1].length;
        Queue<int[]> queue = new LinkedList<>();;
        int[][] visited = new int[dim1*dim2][2];
        int visitedIndex = 0;
        int islandNumber = 0;
        

         for(int i = 0; i < dim1; i++)
         {
            for(int y = 0; y < dim2; y++)
            {
                int[] pos = {i, y};
                if(Character.compare(grid[i][y], '1') == 0 && ContainsArr(visited, pos))
                {
                    queue.offer(pos);
                    visitedIndex = BFsearch(grid, visited, visitedIndex, queue);
                    islandNumber++;
                    

                }


                    
                }
            }

         

        return islandNumber;
    }
    
    private boolean ContainsArr(int[][] search, int[] val)
    {
        for(int i = 0; i < search.length; i++)
        {
            if(Arrays.equals(search[i], val))
            {
                return true;
            }
        }
        return false;
    }
    
    private int BFsearch(char[][] grid, int[][] log, int  index, Queue<int[]> q)
    {
        int returnval = index;
        if(!q.isEmpty())
        {
            int[] currPos = q.peek();
            if (currPos[0] + 1 < grid.length && Character.compare(grid[currPos[0] +1][currPos[1]], '1') == 0 && ContainsArr(log, new int[]{currPos[0] +1, currPos[1]}))
            {
                q.offer(new int[]{currPos[0] +1, currPos[1]});
            }

            if (currPos[0] > 0 && Character.compare(grid[currPos[0] -1][currPos[1]], '1') == 0 && ContainsArr(log, new int[]{currPos[0] -1, currPos[1]}))
            {
                q.offer(new int[]{currPos[0] +1, currPos[1]});
            }

            if (currPos[1] > 0 && Character.compare(grid[currPos[0]][currPos[1] - 1], '1') == 0 && ContainsArr(log, new int[]{currPos[0] ,currPos[1] - 1}))
            {
                q.offer(new int[]{currPos[0] ,currPos[1] - 1});
            }

            if (currPos[1] + 1 < grid[0].length && Character.compare(grid[currPos[0] ][currPos[1] + 1], '1') == 0 && ContainsArr(log, new int[]{currPos[0] ,currPos[1] + 1}))
            {
                q.offer(new int[]{currPos[0] ,currPos[1] + 1});
            }
            log[index] = currPos;
            q.poll();
            returnval = BFsearch(grid, log, index++, q);



        }
        return returnval;

    }

}

