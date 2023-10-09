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

    public void push(int x) {
        if(q1.isEmpty()) q1.add(x);
        else{
            q2.add(x);
            swap(q1, q2);
            swap(q2, q1);
        }
        
    }
    

    private void swap(Queue<Integer> from, Queue<Integer> to)
    {
        while(!from.isEmpty())
        {
            to.add(from.poll());
        }
    }
}