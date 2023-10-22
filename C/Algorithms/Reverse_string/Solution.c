#include <stdio.h>


void reverseString(char* s, int sSize){
    char *temp;
    int j = sSize - 1;
    for(int i = 0; i < sSize / 2; i++)
    {
       if(i == j) break;
       temp = s[i];
       s[i] = s[j];
       s[j] = temp;
       j--;
    }
}   