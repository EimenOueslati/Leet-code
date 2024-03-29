#include<iostream>
#include<vector>
using namespace std;

/*
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    Note that you must do this in-place without making a copy of the array.

    Constraints:
    -> 1 <= nums.length <= 10**4
    -> -2**31 <= nums[i] <= 2**31 - 1
 
*/

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int index = 0;
        for(int num : nums){
            if(num != 0){
                nums[index] = num;
                index++;
            }
        }
        for(int i = index; i < nums.size(); i++){
            nums[i] = 0;
        }
    }
};
