package Algorithms.Pascals_triangle;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new LinkedList<>();
        if(numRows == 1) 
        {
            answer.add(new LinkedList<>());
            answer.get(0).add(1);
            return answer;
        }

        return answer;
    }
}
