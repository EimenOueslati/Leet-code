package Algorithms.Spiral_matrix;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new LinkedList<>();
        addSpiral(answer, matrix);
        return answer;
    }

    
}
