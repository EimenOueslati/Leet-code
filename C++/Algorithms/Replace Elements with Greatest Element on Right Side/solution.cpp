#include<iostream>
#include<vector>
using namespace std;

/*
    Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
    After doing so, return the array.

    Constraints:
    ->1 <= arr.length <= 10**4
    ->1 <= arr[i] <= 10**5
*/
class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int currentMax = INT_MIN;
        int temp;
        for(int i = arr.size() - 1; i >= 0; i--){
            if(currentMax < arr[i]){
                temp = arr[i];
                arr[i] = currentMax;
                currentMax = temp;
                continue;
            }
            arr[i] = currentMax;
        }
        arr[arr.size()-1] = -1;
        return arr;
    }
};
