/*ProblemGiven an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
Example 1:
/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/
//Means we have to return two indices so that their addition should be equal to target
/*
Stepwise logic
step1: substract the target from first element of array(nums) in first iteration(i=0)
step2: Create a second loop which is one step ahead from first loop (j=i+1)
step3:And check whether the substracted element is present in the array or not 
step4:If substracted element is found in the array then return(i,j)
step5:If substracted element is not found then increase i by 1 and follow again from first step 
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Input array must have at least two elements");
        }
        // Main logic
        int size = nums.length;
        for (int i = 0; i < size; i++) {
        //substracted element
            int e = target - nums[i];
            for (int j = i + 1; j < size; j++) {
            //search is substracted element is in the array or not?
                if (nums[j] == e) {
                    return new int[]{i, j};
                }
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
}
