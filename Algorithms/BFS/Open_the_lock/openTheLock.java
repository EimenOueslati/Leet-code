package Algorithms.BFS.Open_the_lock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*
 * This class in the solution for the leetcode proble "Open the lock":
 * You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.
 * The lock initially starts at '0000', a string representing the state of the 4 wheels.
 * 
 * You are given a list of deadends dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.
 * 
 * Given a target representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.'
 * 
 * Constraints:
 *  1 <= deadends.length <= 500
 *  deadends[i].length == 4
 *  target.length == 4 
 *  target will not be in the list deadends.
 *  target and deadends[i] consist of digits only.
 */
public class openTheLock {
    public int openLock(String[] deadEnds, String target)
    {
        HashSet<String> dead_ends = new HashSet<>(Arrays.asList(deadEnds));
        if(dead_ends.contains("0000"))
        {
            return -1;
        }
        HashSet<String> visited = new HashSet<>();
        visited.add("0000");

        Queue<String> q = new LinkedList();
        q.add("0000");
        int level = 0;

        while(!q.isEmpty())
        {
            int size = q.size();
            while(size > 0)
            {
                String current_comb = q.poll();
                visited.add(current_comb);
                if(current_comb.equals(target))
                {
                    return level;
                }
                if(dead_ends.contains(current_comb))
                {
                    size--;
                    continue;
                }
                StringBuilder sb = new StringBuilder(current_comb);
                for(int i = 0; i < 4; i++)
                {
                    char current_position = sb.charAt(i);
                    String sb1 = sb.substring(0, i) + (current_position == '9' ? 0 : current_position - '0' + 1) + sb.substring(i+1); 
                    String sb2 = sb.substring(0, i) + (current_position == '0' ? 9 : current_position - '0' - 1) + sb.substring(i+1);

                    if(!dead_ends.contains(sb1) && !visited.contains(sb1))
                    {
                        q.offer(sb1);
                        visited.add(sb1);
                    }
                     if(!dead_ends.contains(sb2) && !visited.contains(sb2))
                    {
                        q.offer(sb2);
                        visited.add(sb2);
                    }
                }

                size--;
            }
            level++;
        }



        return -1;
    }
}
