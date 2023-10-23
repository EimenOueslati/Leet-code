#include <stdio.h>
#include <stdlib.h>
#include <limits.h>


int arrayPairSum(int* nums, int numsSize){
    int sorted[numsSize];
    int smallest = 0;
    for(int i = 0; i < numsSize; i++)
    {
        for(int j = 0; j < numsSize; j++)
        {
            if(nums[j] <= nums[smallest])
            {
                smallest = j;
            }
        }
        sorted[i] = nums[smallest];
        nums[smallest] = INT_MAX;
    }
    int ret = 0;
    for(int i = 0; i < numsSize; i += 2)
    {
        ret += sorted[i];
    }
    return sorted;
}
