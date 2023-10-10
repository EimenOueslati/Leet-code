package Algorithms.Decoding_string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    private Stack<Character> st;
    public String decodeString(String s){
        st = new Stack<>();
        String ret = "";
        for(char c : s.toCharArray())
        {
            if(c != ']')
            {
                st.add(c);
            }else{
                String temp = "";
                while(!st.isEmpty() && st.peek() != '[')
                {
                    temp = st.pop() + temp;
                }
                st.pop();
                String num = "";
                while(!st.isEmpty() && Character.isDigit(st.peek()))
                {
                    num = st.pop() + num;
                }
                for(int i = 0; i < Integer.parseInt(num); i++)
                {
                    for(char k : temp.toCharArray())
                    {
                        st.add(k);
                    }
                }
            }
        }
        
        while(!st.isEmpty())
        {
            ret = st.pop() + ret;
        }
        return ret;
    }
}
