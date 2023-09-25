package Algorithms.BFS.Find_the_difference;

public class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        int sb1len = sb1.length();
        int sb2len = sb2.length();

        for(int i = 0; i < sb1len; i++)
        {
            for(int j = 0; j < sb2len; j++)
            {
                if(sb1.charAt(i) == (sb2.charAt(j)))
                {
                    sb2 = sb2.deleteCharAt(j);
                    j = sb2len;
                }
            }
            sb2len--;
        }
        
        
        
        
        return sb2.charAt(0);
    }

}
