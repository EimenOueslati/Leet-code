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
    //Created a char pointer to temporarily hold a vlue before swapping
    char *temp;
    int j = sSize - 1;
    //Loop throught the String and swap the chars until we reach the middle.
    for(int i = 0; i < sSize / 2; i++)
    {
       if(i == j) break; // Break condition for when we reach the middle.
       temp = s[i];
       s[i] = s[j];
       s[j] = temp;
       j--;
    }
}   