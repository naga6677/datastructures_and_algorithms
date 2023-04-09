package com.dsa.arrays.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * Input: nums = [2,7,11,15], target = 9
 * 
 * Output: [0,1]
 * 
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * @author IND
 *
 */
public class TwoSum {

	private int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> aMap = new HashMap<>();

		int[] tempArray = new int[2];

		for (int i = 0; i < nums.length; i++) {

			int currentElement = nums[i];
			int remainder = target - currentElement;

			Integer index = aMap.get(remainder);

			if (index != null) {
				tempArray[0] = index;
				tempArray[1] = i;
				break;
			} else {
				aMap.put(currentElement, i);
			}

		}

		return tempArray;

	}

	public static void main(String args[]) {

		int nums[] = { 2, 7, 11, 15 };
		int target = 9;

		TwoSum twoSum = new TwoSum();
		nums = twoSum.twoSum(nums, target);
		for (int i : nums) {
			System.out.println(i);
		}
	}
}
