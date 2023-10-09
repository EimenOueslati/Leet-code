package Data_structures.Java_stack_queue_implementation;

import java.util.Stack;


/*
 * This class is the solution for the leetcode problem "Implement Queue using Stacks":
 * 
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 * Implement the MyQueue class:
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * 
 * Notes:
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 */
public class MyQueue {

    private Stack<Integer> st1;
    private Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

     public void push(int x) {
        if(st1.empty()) st1.add(x);
        else{
            swap(st1, st2);
            st2.add(x);
            swap(st2, st1);
        }
    }

      public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }

    private void swap(Stack<Integer> from, Stack<Integer> to)
    {   
        while(!from.isEmpty())
        {
            to.add(from.pop());
        }
        

    }
}
