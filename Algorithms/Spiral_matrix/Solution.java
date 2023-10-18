package Algorithms.Spiral_matrix;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new LinkedList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        addSpiral(0, 0, visited, matrix,answer, 0);
        return answer;
    }

    /*private void addSpiral(int x, int y, boolean[][] visited, int[][]  matrix, List<Integer> answer)
    {
        answer.add(matrix[x][y]);
        visited[x][y] = true;
        if( y < matrix[0].length - 1 && !visited[x][y + 1])
        {
            addSpiral(x, y + 1, visited, matrix, answer);
        }else if( x < matrix.length - 1 && !visited[x + 1][y])
        {
            addSpiral(x + 1, y, visited, matrix, answer);
        }else if( y > 0 && !visited[x][y - 1])
        {
            addSpiral(x , y - 1, visited, matrix, answer);
        }else if( x > 0 && !visited[x - 1][y])
        {
            addSpiral(x - 1, y, visited, matrix, answer);
        }else{
            return;
        }
    }*/
    
    private void addSpiral(int x, int y, boolean[][] visited, int[][]  matrix, List<Integer> answer, int dir)
    {
        answer.add(matrix[x][y]);
        visited[x][y] = true;
        if((x == 0 || visited[x - 1][y]) && (y == matrix[0].length - 1 || visited[x][y + 1]) && (x == matrix.length - 1 || visited[x + 1][y]) && (y == 0 || visited[x][y - 1])) return;
        if( dir == 0 )
        {
            if(y < matrix[0].length - 1 && !visited[x][y + 1]) addSpiral(x, y + 1, visited, matrix, answer, 0);
            else addSpiral(x + 1, y, visited, matrix, answer, 1);
            
        }else if( dir == 1)
        {
            if(x < matrix.length - 1 && !visited[x + 1][y]) addSpiral(x + 1, y, visited, matrix, answer, 1);
            else addSpiral(x , y - 1, visited, matrix, answer, 2);
        }else if(dir == 2)
        {
            if(y > 0 && !visited[x][y - 1]) addSpiral(x , y - 1, visited, matrix, answer, 2);
            else addSpiral(x - 1, y, visited, matrix, answer, 3);
        }else if( dir == 3)
        {
            if (x > 0 && !visited[x - 1][y]) addSpiral(x - 1, y, visited, matrix, answer, 3);
            else addSpiral(x, y + 1, visited, matrix, answer, 0);
        }
    }

}
