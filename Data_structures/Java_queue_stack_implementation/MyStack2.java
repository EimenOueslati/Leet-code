package Data_structures.Java_queue_stack_implementation;

import java.util.LinkedList;
import java.util.Queue;

/*
 * This class is the solution for the leetcode problem "Implement Stack using Queues":
 * 
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 *
 * Implement the MyStack class:
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 * Notes:
 * You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
 * Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 * 
 * Constraints:
 * 1 <= x <= 9
 * At most 100 calls will be made to push, pop, top, and empty.
 * All the calls to pop and top are valid.
 * 
 * 
 * Follow-up: Can you implement the stack using only one queue?
 */
public class MyStack2 {
    private Queue<Integer> q;
    private int size;
    public MyStack2()
    {
        q = new LinkedList<>();
        size = 0;
    }

    public void push(int x)
    {
        size++;
        q.add(x);
        for(int i = 0; i < size - 1; i++)
        {
            q.add(q.poll());
        }

    }

    public int pop()
    {
        if(size > 0) size--;
        return q.poll();
    }

    public int top()
    {
        return q.peek();
    }

    public boolean empty()
    {
        return size == 0;
    }
    
}
