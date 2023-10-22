package Data_structures.Java_queue_stack_implementation;

public class Main {
    public static void main(String[] args) {
        MyStack2 obj = new MyStack2();
        obj.push(1);
        obj.push(2);
        int param_1 = obj.top();
        int param_2 = obj.pop();
        boolean param_4 = obj.empty();
        System.out.println(param_1 + " " + param_2 + " " + param_4);
    }
    
}
