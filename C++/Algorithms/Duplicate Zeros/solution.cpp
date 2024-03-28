#include<iostream>
#include<vector>
using namespace std;

/*
    Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
    Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

    Constraints:
    1 <= arr.length <= 10**4
    0 <= arr[i] <= 9

 
*/
class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        vector<int> temp;
        int index = 0;
        while(temp.size() < arr.size()){
            temp.push_back(arr[index]);
            if(arr[index] == 0){
                temp.push_back(0);
            }
            index++;
        }
        temp.resize(arr.size());
        arr = temp;
    }
};
