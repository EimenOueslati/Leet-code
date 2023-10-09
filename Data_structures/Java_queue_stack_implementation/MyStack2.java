package Data_structures.Java_queue_stack_implementation;

import java.util.LinkedList;
import java.util.Queue;

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
        for(int i = 0; i < size; i++)
        {
            q.add(q.poll());
        }

    }
    
}
