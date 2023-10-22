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
    //initialize some poiters to the start and end of the string
    char *start = s;
    char *end = s + sSize - 1;

    //this variable will temporarily hold the value to switch.
    char temp;

    //keep switching the values untill we reach the end.
    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}   