package Data_structures.java_stack_implementation;

public class Main {
    public static void main(String[] args) {
        Minstack obj = new Minstack();
        obj.push(3);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }
    
}