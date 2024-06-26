#include<iostream>
#include<vector>
using namespace std;

/*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. 
    Then return the number of elements in nums which are not equal to val.
    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    -> Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
       The remaining elements of nums are not important as well as the size of nums.
    -> Return k

    Constraints:
    0 <= nums.length <= 100
    0 <= nums[i] <= 50
    0 <= val <= 100
*/
class Solution {
public:
    static int removeElement(vector<int>& nums, int val) {
        int slowPoint = 0;
        for(int i = 0; i < nums.size(); i++){  
            if(nums[i] != val){
                nums[slowPoint] = nums[i];
                slowPoint++;
            }
        }
        return slowPoint;
    }
};

int main(){
    vector<int> arr({3,2,2,3});
    cout << Solution::removeElement(arr, 3) << "\n";
    for(int num : arr){
        cout << num;
    }
}
