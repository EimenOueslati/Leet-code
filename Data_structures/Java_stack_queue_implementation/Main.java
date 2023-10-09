package Data_structures.Java_stack_queue_implementation;

public class Main {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        int param_1 = obj.pop();
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println(param_1 + " " + param_2 + " " + param_3 + " " + param_4);
    }
    
}
