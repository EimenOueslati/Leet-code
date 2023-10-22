package Algorithms.BFS.Find_the_difference;

/*
 * This class in the solution for the leetcode proble "Open the lock":
 * You are given two strings s and t.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Return the letter that was added to t.
 * 
 * Constraints:
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s and t consist of lowercase English letters.
 */
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}