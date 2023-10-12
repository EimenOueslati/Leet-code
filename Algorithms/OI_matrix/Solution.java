package Algorithms.OI_matrix;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
         for(int i = 0; i < mat.length; i++)
         {
             for(int j = 0; j < mat[i].length; j++)
             {
                 if(mat[i][j] == 0) q.offer(new int[]{i,j,0});
                 else mat[i][j] = Integer.MAX_VALUE;
             }
         }
         int[][] directions = new int[][]{{-1,0}, {0,1}, {1,0}, {0, -1}};
         while(!q.isEmpty())
         {
             int[] curr = q.poll();
             int x = curr[0];
             int y = curr[1];
             int dis = curr[2];
             for(int[] dir : directions)
             {
                 int hor = x + dir[0];
                 int vert =  y + dir[1];
                 if((hor < mat.length && hor >= 0) && (vert < mat[hor].length && vert >= 0) && !visited[hor][vert])
                 {
                     if(mat[hor][vert] > dis)
                     { 
                         mat[hor][vert] = dis + 1;
                         visited[hor][vert] = true;
                         q.offer(new int[]{hor, vert, dis + 1});
                     }
                 }
             }
         }
 
         return mat;
     }
}
