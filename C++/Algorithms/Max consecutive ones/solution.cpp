#include<iostream>
#include<vector>
using namespace std;

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
