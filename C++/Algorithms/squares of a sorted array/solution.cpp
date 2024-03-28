#include<iostream>
#include<vector>
#include<stdlib.h>
#include<cmath>
using namespace std;

/*
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

    Constraints:
    1 <= nums.length <= 10**4
    -10**4 <= nums[i] <= 10**4
    nums is sorted in non-decreasing order.
*/
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int size = nums.size();
        vector<int> squaredNums(size);
        int leftInd = 0;
        int rightInd = size - 1;
        int currentPos = size - 1;
        while(leftInd <= rightInd){
            if(abs(nums.at(leftInd)) >= abs(nums.at(rightInd))){
                squaredNums[currentPos--] = nums.at(leftInd) * nums.at(leftInd);
                leftInd++;
            }else{
                squaredNums[currentPos--] = nums.at(rightInd) * nums.at(rightInd);
                rightInd--;
            }
        }
        return squaredNums;
    }
};
