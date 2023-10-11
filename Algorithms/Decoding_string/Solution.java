package Algorithms.Decoding_string;

import java.util.Stack;


/*
 * This class in the solution for the leetcode problem "Decode string":
 * Given an encoded string, return its decoded string. 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 * The test cases are generated so that the length of the output will never exceed 105.
 * 
 * Constraints:
 * 1 <= s.length <= 30
 * s consists of lowercase English letters, digits, and square brackets '[]'.
 * s is guaranteed to be a valid input.
 * All the integers in s are in the range [1, 300].
 */
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
