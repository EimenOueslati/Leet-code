package Algorithms.Reverse_polish_notation;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] rpn = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(sol.evalRPN(rpn));
    }
}
