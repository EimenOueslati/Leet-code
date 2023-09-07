package Algorithms.BFS.Number_of_islands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    
private int n;
private int m;

public int numIslands(char[][] grid) {
    int count = 0;
    n = grid.length;
    if (n == 0) return 0;
    m = grid[0].length;
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++)
            if (grid[i][j] == '1') {
                DFsearch(grid, i, j);
                ++count;
            }
    }    
    return count;
}
    
    private void DFsearch(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DFsearch(grid, i + 1, j);
        DFsearch(grid, i - 1, j);
        DFsearch(grid, i, j + 1);
        DFsearch(grid, i, j - 1);
    }
    
   

   

}

