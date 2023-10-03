package Data_structures.java_stack_implementation;

import java.util.ArrayList;

public class Minstack {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> min_stack;
    private int size;
    private int min;
    public Minstack() {
        stack = new ArrayList<>();
        min_stack = new ArrayList<>();
        size = 0;
        min = Integer.MAX_VALUE;
    }
}
