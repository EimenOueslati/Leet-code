package Algorithms.Keys_and_rooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(new ArrayList<>());         
        listOfLists.add(Arrays.asList(1, 3));          
        listOfLists.add(Arrays.asList(2));          
        listOfLists.add(Arrays.asList(3));
        Solutions sol = new Solutions();
        System.out.println(sol.canVisitAllRooms(listOfLists));

    }
}
