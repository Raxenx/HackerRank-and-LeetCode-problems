
public class Solution {
	/*
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

		You may assume that each input would have exactly one solution, and you may not use the same element twice.
		Given nums = [2, 7, 11, 15], target = 9,

		Because nums[0] + nums[1] = 2 + 7 = 9,
		return [0, 1].
	 */
	public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
        	int sumIndex = 0;
        	if (nums[sumIndex] + nums[i] == target) {
        		return new int[] { sumIndex, i++ }; 
        	} else {
        		sumIndex++;
        	}
        }
		return nums;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2, 4 };
		assert twoSum(a, 3) == new int[] { 0, 1 };
	}

}
