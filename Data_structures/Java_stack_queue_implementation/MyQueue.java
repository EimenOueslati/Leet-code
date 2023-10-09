package Data_structures.Java_stack_queue_implementation;

import java.util.Stack;

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

    private void swap(Stack<Integer> from, Stack<Integer> to)
    {   
        while(!from.isEmpty())
        {
            to.add(from.pop());
        }
        

    }
}
