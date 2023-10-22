#include <stdio.h>


/*
This function is the solution for the leetcode problem "Revers String":
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.


Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 
*/
void reverseString(char* s, int sSize){
    char *start = s;
    char *end = s + sSize - 1;
    char temp;
    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}   