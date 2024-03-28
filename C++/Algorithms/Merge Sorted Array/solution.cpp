#include<iostream>
#include<vector>
using namespace std;

/*
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 
    and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, 
    where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

    Constraints:
    nums1.length == m + n
    nums2.length == n
    0 <= m, n <= 200
    1 <= m + n <= 200
    -109 <= nums1[i], nums2[j] <= 109
    */
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(nums1.size() == 0 || nums2.size() == 0){
            return;
        }
        vector<int> temp;
        int arr2Size = nums2.size();
        int arr1Size = nums1.size() - arr2Size;
        int indextArr1 = 0;
        int indextArr2 = 0;
        while(temp.size() != nums1.size()){
            if(indextArr1 < arr1Size && indextArr2 < arr2Size){
                if(nums1[indextArr1] > nums2[indextArr2]){
                    temp.push_back(nums2[indextArr2++]);
                }else{
                    temp.push_back(nums1[indextArr1++]);   
                }
            }else if(indextArr1 < arr1Size){
                temp.push_back(nums1[indextArr1++]);
            }else{
                temp.push_back(nums2[indextArr2++]);
            }
        }
        nums1 = temp;

    }
};
