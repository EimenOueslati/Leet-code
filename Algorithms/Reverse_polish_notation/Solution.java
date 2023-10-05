package Algorithms.Reverse_polish_notation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int operator1, operator2;
        for(String c : tokens)
        {
            if(c.equals("+"))
            {
                operator1 = st.pop();
                operator2 = st.pop();
                st.add(operator1 + operator2);
            }else if(c.equals("-"))
            {
                operator1 = st.pop();
                operator2 = st.pop();
                st.add(operator2 - operator1);
            }else if(c.equals("*"))
            {
                operator1 = st.pop();
                operator2 = st.pop();
                st.add(operator1 * operator2);
            }else if(c.equals("/"))
            {
                operator1 = st.pop();
                operator2 = st.pop();
                st.add((int)Math.floor(operator2 / operator1));
            }else{
                st.add(Integer.parseInt(c));
            }
        }
        return st.pop(); 
    }
}
