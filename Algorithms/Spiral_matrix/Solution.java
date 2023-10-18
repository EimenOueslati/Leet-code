package Algorithms.Spiral_matrix;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new LinkedList<>();
        //addSpiral(answer, matrix);
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        answer.add(matrix[0][0]);
        visited[0][0] = true;
        return answer;
    }

    private void addSpiral(int x, int y, boolean[][] visited, int[][]  matrix, List<Integer> answer)
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
    }

}
