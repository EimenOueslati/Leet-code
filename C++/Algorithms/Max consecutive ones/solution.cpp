#include<iostream>
#include<vector>
using namespace std;

/*
    Given a binary array nums, return the maximum number of consecutive 1's in the array.
    Constraints:
    1 <= nums.length <= 10
    nums[i] is either 0 or 1.
*/
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int max = 0;
        int count = 0;
        for(int num : nums){
            if(num == 1){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }
};
