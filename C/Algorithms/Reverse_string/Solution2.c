#include <stdio.h>

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