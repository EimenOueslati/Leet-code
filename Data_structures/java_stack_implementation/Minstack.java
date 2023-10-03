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

    public void push(int val) {
        stack.add(val);
        if(val < min)
        {
            min = val;
        }
        min_stack.add(min);
        size++;
    }

    public void pop() {
        if(size > 0)
        {
            stack.remove(size-1);
            min_stack.remove(size-1);
            size--;
            if(size > 0)
            {
                min = min_stack.get(size-1);
            }else{
                min = Integer.MAX_VALUE;
            }
        }
    }

}
