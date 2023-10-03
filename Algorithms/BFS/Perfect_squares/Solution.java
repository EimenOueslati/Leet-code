package Algorithms.BFS.Perfect_squares;
import java.util.LinkedList;
import java.util.Queue;
/* 
 * This class in the solution for the leetcode proble "Perfect squares"
 * Given an integer n, return the least number of perfect square numbers that sum to n.
 * A perfect square is an integer that is the square of an integer; in other words, 
 * it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 * 
 * Constraints:
 *      1 <= n <= 10^^4
 */
public class Solution {
    public int  numSquares(int n)
    {
        int steps = 1; // variable to keep track of how many steps we curent have
        Queue<Integer> q = new LinkedList<>(); // A queue for the BFS search
        
        // Get the largest perfect square that is smaller than the target int
        Double i = Math.floor(Math.sqrt(n));
        for(int j = 1; j <= i; j++)
        {
            q.offer(j*j);
        }
        if(q.contains(n)) // In case the targer is a perfect square
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
