package Algorithms.Pascals_triangle;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new LinkedList<>();
        answer.add(new LinkedList<>());
            answer.get(0).add(1);
        if(numRows == 1) 
        {  
            return answer;
        }
        populateList(answer, 2, numRows);
        return answer;
    }

    private void populateList(List<List<Integer>> list, int index, int limit)
    {
        list.add(new LinkedList<>());
        list.get(index - 1).add(1);
        for(int i = 1; i < index - 1; i++)
        {
            list.get(index - 1).add(list.get(index - 2).get(i - 1) + list.get(index - 2).get(i));
        }
        list.get(index - 1).add(1);
        if(index == limit) return;
        else populateList(list, index + 1, limit);
    }
}
