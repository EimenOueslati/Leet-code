#include<iostream>
#include<vector>
#include <algorithm>
using namespace std;


/*
    A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
    You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
    Return the number of indices where heights[i] != expected[i].

    Constraints:
    -> 1 <= heights.length <= 100
    -> 1 <= heights[i] <= 100
*/
class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int ret = 0;
        int currHeight = 0;
        int freq[101];
        for(int num : heights){
            freq[num]++;
        } 
        for(int i = 0; i < heights.size(); i++){
            while(freq[currHeight] == 0) currHeight++;

            if(heights[i] != currHeight) ret++;
            freq[currHeight]--;
        }

        return ret;
    }
};
