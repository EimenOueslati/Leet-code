package Algorithms.Valid_parantheses;


/*
 * This class in the solution for the leetcode problem "Valid parantheses":
 * Given an array of integers temperatures represents the daily temperatures, return an array answer 
 * such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 * 
 * Constraints:
 *  1 <= temperatures.length <= 105
 * 30 <= temperatures[i] <= 100
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
