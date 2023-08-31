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
    
    public boolean isEmpty() {
        return isEmpt;
        
    }
    
    public boolean isFull() {
        if(((tail + 1) % size) == head)
        {
            return true;
        }
    
}