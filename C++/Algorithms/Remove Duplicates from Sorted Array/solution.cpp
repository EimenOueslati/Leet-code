#include<iostream>
#include<vector>
using namespace std;

/*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
    ->Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    ->Return k.

    Constraints:
    1 <= nums.length <= 3 * 104
    -100 <= nums[i] <= 100
    nums is sorted in non-decreasing order.
*/
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int index = 0;
        int curUnique;
        for(int i = 0; i < nums.size(); i++){
            curUnique = nums[i];
            nums[index] = curUnique;
            while(i < nums.size() - 1 && nums[i + 1] == curUnique){
                i++;
            }
            index++;
        }
        return index;
    }
};
