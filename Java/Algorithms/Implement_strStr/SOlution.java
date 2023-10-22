package Algorithms.Implement_strStr;


/*
 * This class is the solution for the leetcode problem "Implement strStr()":
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * 
 * Constraints:
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;
        if(needle.length() > haystack.length()) return -1;
        for(int i = 0; i < haystack.length(); i++)
        {
            if(haystack.length() - i < needle.length()) return -1;
            if(haystack.charAt(i) ==  needle.charAt(0))
            {
                if(haystack.substring(i, i + needle.length()).equals(needle)) return i;
            }
        }

        return -1;
    }
}