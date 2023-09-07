/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
    An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

    Constraints:

    ->m == grid.length
    ->n == grid[i].length
    ->1 <= m, n <= 300
    ->grid[i][j] is '0' or '1'.
 */

package Algorithms.BFS.Number_of_islands;

//this class finds the number of islands (adjacent '1's) in a 2D array
public class BFS {
    
    private int n;
    private int m;

    
    public int numIslands(char[][] grid) {
        int count = 0; //Variable to store the number of islands found
        n = grid.length; //Variable to store the "height" of the array
        if (n == 0) return 0;
        m = grid[0].length;//variable to hold the "width" of the array
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                if (grid[i][j] == '1') { //In case a start of an iland was found
                    DFsearch(grid, i, j); //Perform depth first search starting at the found element
                    ++count;//Update the cound of the islands
                }
        }    
        return count;
    }
    
    //This function recursivly performs depth first search
    private void DFsearch(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return; //Return condition
            grid[i][j] = '0';//Mark the element as visited

            //Call the function on adjacent elments
            DFsearch(grid, i + 1, j);
            DFsearch(grid, i - 1, j);
            DFsearch(grid, i, j + 1);
            DFsearch(grid, i, j - 1);
    }
}

