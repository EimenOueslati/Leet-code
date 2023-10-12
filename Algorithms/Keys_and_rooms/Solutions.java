package Algorithms.Keys_and_rooms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solutions {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            Queue<Integer> q = new LinkedList<>();
            boolean[]  unlocked = new boolean[rooms.size()];
            int visitedRooms = 0;
            for(Integer i : rooms.get(0))
            {
                q.offer(i);
            }
            rooms.get(0).clear();
            unlocked[0] = true;
            visitedRooms++;
            int currentRoom;
            while(!q.isEmpty())
            {
                currentRoom = q.poll();
                if(!unlocked[currentRoom]) 
                {
                    visitedRooms++;
                    unlocked[currentRoom] = true;
                }
                for(Integer i : rooms.get(currentRoom))
                {
                    q.offer(i);
                }
                rooms.get(currentRoom).clear();

            }
            return (visitedRooms == rooms.size()) ? true : false;

        
    }

}
