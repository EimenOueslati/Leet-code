/**
 * Implement the MyCircularQueue class:

    -> MyCircularQueue(k) Initializes the object with the size of the queue to be k.
    -> int Front() Gets the front item from the queue. If the queue is empty, return -1.
    -> int Rear() Gets the last item from the queue. If the queue is empty, return -1.
    -> boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
    -> boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
    -> boolean isEmpty() Checks whether the circular queue is empty or not.
    -> boolean isFull() Checks whether the circular queue is full or not.

constraints:
    -> 1 <= k <= 1000
    -> 0 <= value <= 1000
    -> At most 3000 calls will be made to enQueue, deQueue, Front, Rear, isEmpty, and isFull.
 */

//This class is a self-implementation of the queue data structure
public class MyCircularQueue {
    private int head;   //variable to store the position of the head of the queue
    private int tail;   // variable to store the position of the tail of the queue
    private int size;   //variable to store the size of the array containing the queue
    private boolean isEmpt; //variable to keep track of the satate of the queue
    private int[] queue; //the array contianing the queue

    public MyCircularQueue(int k) {
        head = 0;
        tail = 0;
        isEmpt = true;
        if(k > 1000){  //Make sure the value is within the constraints
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

    //This function adds a new value to the queue
    public boolean enQueue(int value) {
        if (isFull() || value < 0 || value > 1000){  //Make sure the queue is not full and the value is within the constaints
            return false;
        }
        else if(head == tail && isEmpty()){ //In case this is the first element in the queue
            queue[head] = value;
            isEmpt = false;
            return true;
        }
        tail = (tail + 1) % size;
        queue[tail] = value;
        return true;
                
    }

    //This function removes and element from the queue
    public boolean deQueue() {
        if(isEmpty()){ //Make sure that the queue is not empty
            return false;
        }
        else if(head == tail) //In case we only have one element in the queue
        {
            isEmpt = true; //Set the queue state to empty
            return true;
        }else{
            head = (head + 1) % size;
            return true;
        }
        
    }

    //This functions returns the first element in the queue
    public int Front() {
        if(isEmpty()){ //Make sure the queue is not empty
            return -1;
        }else{
            return queue[head];
        }
    }
    
    //This function returns the last element in the queue
    public int Rear() {
        if(isEmpty()){ //Make sure the queue is not empty
            return -1;
        }else{
            return queue[tail];
        }
    }
    
    //This function returns true if the queue is empty and false otherwise 
    public boolean isEmpty() {
        return isEmpt;
        
    }

    //This function returns true if the queue is full and false otherwise 
    public boolean isFull() {
        if(!isEmpty() && ((tail + 1) % size) == head)
        {
            return true;
        }
        return false;
    
    } 
}  