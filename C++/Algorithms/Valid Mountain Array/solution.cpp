#include<iostream>
#include<vector>
using namespace std;

/*
    Given an array of integers arr, return true if and only if it is a valid mountain array.
    Recall that arr is a mountain array if and only if:
    ->arr.length >= 3
    ->There exists some i with 0 < i < arr.length - 1 such that:
    ->arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    ->arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

    Constraints:
    ->1 <= arr.length <= 104
    ->0 <= arr[i] <= 104

*/
class Solution {
public:
    static bool validMountainArray(vector<int>& arr) {
        if(arr.size() < 3) return false;
        int index = 0;
        while(index < arr.size() - 1){
            if(arr[index] < arr[index + 1]){
                index++;
            }else{
                break;
            }
        }
        if(index == 0 || index == arr.size() - 1) return false;
        while(index < arr.size() - 1){
            if(arr[index] <= arr[index + 1]){
                return false;
            }
            index++;
        }
        return true;
    }
};
