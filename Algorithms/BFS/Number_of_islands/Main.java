package Algorithms.BFS.Number_of_islands;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        BFS algo = new BFS();
        char[][] array ={
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println(algo.numIslands(array));
    }
}
