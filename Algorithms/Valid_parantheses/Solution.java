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
    char[] arr = new char[]{')',']','}'};
    List<char[]> charl = Arrays.asList(arr);
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < sb.length(); i++)
    {
        if(charl.contains(sb.charAt(i)))
        {
            if(st.peek() != map.get(sb.charAt(i))) return false;
            st.pop();
        }else
        {
            st.add(sb.charAt(i));
        }
    }
    return st.isEmpty();
  }
    
}
