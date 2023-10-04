package Algorithms.Valid_parantheses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

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
