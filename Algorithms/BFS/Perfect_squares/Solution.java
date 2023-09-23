package Algorithms.BFS.Perfect_squares;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int  numSquares(int n)
    {
        int steps = 1;
        Queue<Integer> q = new LinkedList();
        Double i = Math.floor(Math.sqrt(n));
        for(int j = 1; j <= i; j++)
        {
            q.offer(j*j);
        }
        if(q.contains(n))
        {
            return 1;
        }

        //BFS search
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size > 0)
            {
                int current = q.poll();
                for(int j = 1; j <= i; j++ )
                {
                    int addition = current + (j*j);
                    if(addition == n)
                    {
                        steps++;
                        return steps;
                    }
                    if(addition < n)
                    {
                        q.offer(addition);
                    }else{
                        continue;
                    }
                }
                size--;
            }
            steps++;

        }   
     return -1; 
    }
}
