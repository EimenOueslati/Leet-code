package Data_structures.Java_queue_stack_implementation;

public class Main {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(19);
        int param_1 = obj.top();
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_1 + " " + param_2 + " " + param_3 + " " + param_4);
    }
    
}
