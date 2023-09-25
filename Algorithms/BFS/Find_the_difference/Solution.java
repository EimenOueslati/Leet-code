package Algorithms.BFS.Find_the_difference;

public class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        int[] Sarr = new int[26];
        int[] Tarr = new int[26];
        
        for(int i = 0; i < s.length(); i++)
        {
           Sarr[sb1.charAt(i) - 97]++;
        }

        for(int i = 0; i < t.length(); i++)
        {
           Tarr[sb2.charAt(i) - 97]++;
        }

        for(int i = 0; i < 26; i++)
        {
            if(Sarr[i] != Tarr[i])
            {
                return (char)(i + 97);
            }
        }
        return 'a';
    }

}
