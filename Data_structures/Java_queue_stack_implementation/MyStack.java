package Data_structures.Java_queue_stack_implementation;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    

    private void swap(Queue<Integer> from, Queue<Integer> to)
    {
        while(!from.isEmpty())
        {
            to.add(from.poll());
        }
    }
}