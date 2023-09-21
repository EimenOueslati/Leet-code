package Algorithms.BFS.Open_the_lock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

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
