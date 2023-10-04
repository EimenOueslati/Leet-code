package Algorithms.Valid_parantheses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


/*
 * This class in the solution for the leetcode proble "Open the lock":
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.

 */
public class Solution {

  Map<Character, Character> map = new HashMap<>();
  Stack<Character> st= new Stack<>();
  public boolean isValid(String s)
  {
    map.put(')', '(');
    map.put(']', '[');
    map.put('}', '{');
    Character[] arr = new Character[]{')',']','}'};
    List<Character> charl = Arrays.asList(arr);
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < sb.length(); i++)
    {

        char curr = sb.charAt(i);
        if(charl.contains(curr))
        {
            if(st.isEmpty()) return false;
            if(st.peek() != map.get(curr)) return false;
            st.pop();
        }else
        {
            st.add(curr);
        }
    }
    return st.isEmpty();
  }
   
}
