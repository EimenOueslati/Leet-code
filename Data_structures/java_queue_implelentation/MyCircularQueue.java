/**
 * Implement the MyCircularQueue class:

    -MyCircularQueue(k) Initializes the object with the size of the queue to be k.
    -int Front() Gets the front item from the queue. If the queue is empty, return -1.
    -int Rear() Gets the last item from the queue. If the queue is empty, return -1.
    -boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
    -boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
    -boolean isEmpty() Checks whether the circular queue is empty or not.
    -boolean isFull() Checks whether the circular queue is full or not.
 */

public class MyCircularQueue {
    private int head;
    private int tail;
    private int size;
    private boolean isEmpt;
    private int[] queue;

    public MyCircularQueue(int k) {
        head = 0;
        tail = 0;
        isEmpt = true;
        if(k > 1000){
            size = 1000;
            queue = new int[1000];
        }else if(k < 1){
            size = 100;
            queue = new int[100];
        }else{
            size = k;
            queue = new int[k];
        }
        
    }

    public boolean enQueue(int value) {
        if (isFull() || value < 0 || value > 1000){
            return false;
        }
        else if(head == tail && isEmpty()){
            queue[head] = value;
            isEmpt = false;
            return true;
        }
        tail = (tail + 1) % size;
        queue[tail] = value;
        return true;
                
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        else if(head == tail)
        {
            isEmpt = true;
            return true;
        }else{
            head = (head + 1) % size;
            return true;
        }
        
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }else{
            return queue[head];
        }
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }else{
            return queue[tail];
        }
    }
    
    
    public boolean isEmpty() {
        return isEmpt;
        
    }
    
    public boolean isFull() {
        if(((tail + 1) % size) == head)
        {
            return true;
        }
        return false;
    
    } 
}  