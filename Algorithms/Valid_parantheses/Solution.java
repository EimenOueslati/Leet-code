package Algorithms.Valid_parantheses;


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
  public boolean isValid(String s)
  {
    if(s.length() % 2 != 0) return false;
    char[] arr = new char[s.length()];
    int top = -1;
    for (char c : s.toCharArray())
    {
        if(c == '(' || c == '[' || c == '{')
        {
            arr[++top] = c;
        }else if(top == -1)
        {
           return false;   
        }else if(c == ')' && arr[top--] != '(')
        {
            return false;
        }else if(c == ']' && arr[top--] != '[')
        {
            return false;
        }else if(c == '}' && arr[top--] != '{')
        {
            return false;
        }
    }
    return top == -1;
  }

  
}
