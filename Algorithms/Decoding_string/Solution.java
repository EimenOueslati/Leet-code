package Algorithms.Decoding_string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    
    public String decodeString(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<String> charq = new Stack<>();
        Stack<Integer> intst = new Stack<>();
        int status = 0;
        String answer = "";
        String ret = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(str.charAt(i) == '[') status++;
            else if(str.charAt(i) == ']')
            {
                status--;
                int num = intst.pop();
                String ch = charq.pop() + answer;
                String temp = "";
                for(int j = 0; j < num; j++) temp += ch;
                answer = temp;
                if(status == 0 && answer.length() != 0)
                {
                    ret += answer;
                    answer = "";
                }
            }else if(Character.isDigit(str.charAt(i)))
            {
                    //intst.add(str.charAt(i) - '0');
                    int k = 0;
                    String temp = "";
                    while(i + k < str.length() && Character.isDigit(str.charAt(i + k)))
                    {
                        temp = temp + str.charAt(i + k);
                        k++;
                    }
                    i = i+k-1;
                    intst.add(Integer.parseInt(temp));
            } 
            else
            {
                if(status == 0)
                {
                    int k = 0;
                    String temp = "";
                    while(i + k < str.length() && Character.isLetter(str.charAt(i + k)))
                    {
                        temp = temp + str.charAt(i + k);
                        k++;
                    }
                    i = i+k-1;
                    ret += temp;

                }else
                {
                    int k = 0;
                    String temp = "";
                    while(i < str.length() && Character.isLetter(str.charAt(i + k)))
                    {
                        temp = temp + str.charAt(i + k);
                        k++;
                    }
                    i = i+k-1;
                    charq.add(temp);
                }   
                
            } 
        }

        return ret;
        
    }
}
