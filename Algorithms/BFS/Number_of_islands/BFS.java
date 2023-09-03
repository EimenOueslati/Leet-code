package Algorithms.BFS.Number_of_islands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public int numIslands(char[][] grid) {
        int dim1 = grid.length;
        int dim2 = grid[1].length;
        Queue<int[]> queue = new LinkedList<>();;
        boolean[][] visted1 = new boolean[dim1][dim2];
        ArrayList<int[]> visited = new ArrayList<int[]>();
        //for (int i = 0; i < visited.length; i++) {
          //  Arrays.fill(visited[i], -1);
        //}
        //int visitedIndex = 0;
        int islandNumber = 0;
        

         for(int i = 0; i < dim1; i++)
         {
            for(int y = 0; y < dim2; y++)
            {
                int[] pos = {i, y};
                if(Character.compare(grid[i][y], '1') == 0 && !visted1[i][y])
                {
                    queue.offer(pos);
                    //BFsearch(grid, visited, visitedIndex, queue);
                    //iterativeBFS(grid, visited, queue);
                    iterativeBFS(grid, visted1, queue);
                    islandNumber++;
                    

                }


                    
                }
            }

         

        return islandNumber;
    }
    
    private boolean doesntContainsArr(ArrayList<int[]> search, int[] val)
    {
        for(int i = 0; i < search.size(); i++)
        {
            if(Arrays.equals(search.get(i), val))
            {
                return false;
            }
        }
        return true;
    }
    
    private void BFsearch(char[][] grid, ArrayList<int[]> log, Queue<int[]> q)
    {
        if(!q.isEmpty())
        {
            int[] currPos = q.peek();
            if (currPos[0] + 1 < grid.length && Character.compare(grid[currPos[0] +1][currPos[1]], '1') == 0 && doesntContainsArr(log, new int[]{currPos[0] +1, currPos[1]}))
            {
                q.offer(new int[]{currPos[0] +1, currPos[1]});
            }

            if (currPos[0] > 0 && Character.compare(grid[currPos[0] -1][currPos[1]], '1') == 0 && doesntContainsArr(log, new int[]{currPos[0] -1, currPos[1]}))
            {
                q.offer(new int[]{currPos[0] -1, currPos[1]});
            }

            if (currPos[1] > 0 && Character.compare(grid[currPos[0]][currPos[1] - 1], '1') == 0 && doesntContainsArr(log, new int[]{currPos[0] ,currPos[1] - 1}))
            {
                q.offer(new int[]{currPos[0] ,currPos[1] - 1});
            }

            if (currPos[1] + 1 < grid[0].length && Character.compare(grid[currPos[0] ][currPos[1] + 1], '1') == 0 && doesntContainsArr(log, new int[]{currPos[0] ,currPos[1] + 1}))
            {
                q.offer(new int[]{currPos[0] ,currPos[1] + 1});
            }
            log.add(currPos);
            q.poll();
            BFsearch(grid, log, q);



        }

    }

    private boolean containsArr(ArrayList<int[]> search, int x, int y) {
        for (int[] arr : search) {
            if (arr[0] == x && arr[1] == y) {
                return true;
            }
        }
        return false;
    }

    private void iterativeBFS(char[][] grid, ArrayList<int[]> log, Queue<int[]> q){
        int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty())
        {

            int[] currPos = q.poll();
            for(int[] newpos : direction)
            {
                int newX = currPos[0] + newpos[0];
                int newY = currPos[1] + newpos[1];

                if(newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length
                && grid[newX][newY] == '1' && !containsArr(log, newX, newY))
                {
                    q.offer(new int[]{newX, newY});
                }
            }
            log.add(currPos);


        }
    }


    private void iterativeBFS(char[][] grid, boolean[][] visted1, Queue<int[]> q){
        int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty())
        {

            int[] currPos = q.poll();
            for(int[] newpos : direction)
            {
                int newX = currPos[0] + newpos[0];
                int newY = currPos[1] + newpos[1];

                if(newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length
                && grid[newX][newY] == '1' && !visted1[newX][newY])
                {
                    q.offer(new int[]{newX, newY});
                }
            }
            visted1[currPos[0]][currPos[1]] = true;


        }
    }


}

