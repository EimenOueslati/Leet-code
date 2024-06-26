package Algorithms.Keys_and_rooms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
 * This class in the solution for the leetcode proble "Keys and rooms":
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. 
 * However, you cannot enter a locked room without having its key.
 * When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can 
 * take all of them with you to unlock the other rooms.
 * Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
 * 
 * Constraints:
 * n == rooms.length
 * 2 <= n <= 1000
 * 0 <= rooms[i].length <= 1000
 * 1 <= sum(rooms[i].length) <= 3000
 * 0 <= rooms[i][j] < n
 * All the values of rooms[i] are unique.
 */
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
