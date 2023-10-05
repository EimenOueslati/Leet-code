package Algorithms.Reverse_polish_notation;

import java.util.Stack;


/*
 * This class in the solution for the leetcode problem "Evaluate Reverse Polish Notation":
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * 
 * Note that:
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish notation.
 * The answer and all the intermediate calculations can be represented in a 32-bit integer.
 * 
 * Constraints:
 * 1 <= tokens.length <= 104
 * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */
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
