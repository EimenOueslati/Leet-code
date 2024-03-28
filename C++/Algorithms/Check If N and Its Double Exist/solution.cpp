#include <iostream>
#include <map>
#include <vector>
using namespace std;


/*
    Given an array arr of integers, check if there exist two indices i and j such that :
    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]

    Constraints:
    2 <= arr.length <= 500
    -10**3 <= arr[i] <= 10**3
 
*/
class Solution {
public:
    static bool checkIfExist(vector<int>& arr) {
        map<int, int> nums;
        for(int i = 0; i < arr.size(); i++){
            if(nums.find(arr[i] * 2) != nums.end() && nums.find(arr[i] / 2) != nums.end()) return true;
            nums[arr[i]] = i;
        }
        return false;
    }
};

int main()
{
    vector<int> arr({7,1,14,11});
    cout << Solution::checkIfExist(arr);
}
