package Data_structures.java_stack_implementation;

import java.util.ArrayList;

/*
 * This class is the solution for the leetcode problem "Min Stack":
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * Implement the MinStack class:
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 * 
 * 
 * Constraints:
 * -231 <= val <= 231 - 1
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 * At most 3 * 104 calls will be made to push, pop, top, and getMin.
 */
public class Minstack {
    private ArrayList<Integer> stack; //this stack will keep track of the values
    private ArrayList<Integer> min_stack; //this stack will keep track of the minimum value at each step
    private int size; //this variable will keep track of the size of the stack
    private int min;//this variable will keep track of the minimum value in the stack
    public Minstack() {
        stack = new ArrayList<>();
        min_stack = new ArrayList<>();
        size = 0;
        min = Integer.MAX_VALUE;
    }

    //This function adds a new value to the stack
    public void push(int val) {
        stack.add(val);
        if(val < min)
        {
            min = val;
        }
        min_stack.add(min);
        size++;
    }

    //This function removes and element from the stack
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

    //This function returns the top element of the stack
    public int top() {
        if(size > 0)
        {
            return stack.get(size-1);
        }
        return -1;
    }

    //This function returns the minimum element of the stack
    public int getMin() {
        if(size > 0)
        {
            return min_stack.get(size-1);
        }
        return -1;
    }

}
