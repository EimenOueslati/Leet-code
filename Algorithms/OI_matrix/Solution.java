package Algorithms.OI_matrix;

import java.util.LinkedList;
import java.util.Queue;


/*
 * This class in the solution for the leetcode problem "01 matrix":
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 * The distance between two adjacent cells is 1.
 * 
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 104
 * 1 <= m * n <= 104
 * mat[i][j] is either 0 or 1.
 * There is at least one 0 in mat.
 */
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
