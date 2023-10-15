package Algorithms.Diagonal_traverse;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] ans = new int[mat.length * mat[0].length];
        List<Integer> answer = new ArrayList<>();
        trverseDiag(new int[]{0, 0},mat, answer,true);

        for(int i = 0; i < answer.size(); i++)
        {
            ans[i] = answer.get(i);
        }
       
        return ans;
    }

    private void trverseDiag(int[] startpos, int[][] source, List<Integer> dest, boolean up)
    {
        
        int x = startpos[0];
        int y = startpos[1];
        if(x == source.length -1 && y == source[0].length - 1) 
        {
            dest.add(source[x][y]);
            return;
        }
        dest.add(source[x][y]);
        if(up)
        {
            while(x > 0 && y < source[0].length - 1)
            {
                x--;
                y++;
                dest.add(source[x][y]);
            }
            if(y != source[0].length - 1)
            {
                trverseDiag(new int[]{x, y +1}, source, dest, false);
            }else
            {
                trverseDiag(new int[]{x + 1, y}, source, dest, false);
            }
        }
        else
        {
            while(x < source.length - 1  && y > 0)
            {
                x++;
                y--;
                dest.add(source[x][y]);
            }
            if(x != source.length - 1)
            {
                trverseDiag(new int[]{x + 1, y}, source, dest, true);
            }else
            {
                trverseDiag(new int[]{x , y + 1}, source, dest, true);
            }
        }

    }

}
