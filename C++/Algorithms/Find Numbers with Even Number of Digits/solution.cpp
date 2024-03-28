#include<iostream>
#include <cmath>
#include<vector>
using namespace std;


/*
    Given an array nums of integers, return how many of them contain an even number of digits.
    Constraints:
    1 <= nums.length <= 50
    1 <= nums[i] <= 10**5
*/
class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int count = 0;
        for(int num : nums){
            if(static_cast<int>(floor(log10(num))) % 2 != 0){
                count++;
            }
        }
        return count;
    }
};
