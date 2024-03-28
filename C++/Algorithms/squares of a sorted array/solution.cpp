#include<iostream>
#include<vector>
#include<stdlib.h>
#include<cmath>
using namespace std;

class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int size = nums.size();
        vector<int> squaredNums(size);
        int leftInd = 0;
        int rightInd = size - 1;
        while(leftInd <= rightInd){
            if(abs(nums.at(leftInd)) >= abs(nums.at(rightInd))){
                squaredNums.insert(squaredNums.begin(), pow(nums.at(leftInd), 2));
                leftInd++;
            }else{
                squaredNums.insert(squaredNums.begin(), pow(nums.at(rightInd), 2));
                rightInd--;
            }
        }
        return squaredNums;
    }
};
