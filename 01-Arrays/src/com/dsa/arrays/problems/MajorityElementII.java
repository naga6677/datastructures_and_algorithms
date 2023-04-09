package com.dsa.arrays.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/majority-element-ii/
 * 
 * Given an integer array of size n, find all elements that appear more than ⌊
 * n/3 ⌋ times.
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3] Output: [3]
 * 
 * @author IND
 *
 */
public class MajorityElementII {

	public List<Integer> majorityElement(int[] nums) {
		List<Integer> majorityElementList = new ArrayList<>();

		int count1 = 0;
		int count2 = 0;

		int candidate1 = (int) 1e9;
		int candidate2 = (int) 1e9 - 1;

		int arrayLength = nums.length;

		for (int i = 0; i < arrayLength; i++) {

			int currentElement = nums[i];

			if (candidate1 == currentElement) {
				count1++;
			} else if (candidate2 == currentElement) {
				count2++;
			} else if (count1 == 0) {
				count1++;
				candidate1 = currentElement;
			} else if (count2 == 0) {
				count2++;
				candidate2 = currentElement;
			} else {
				count1--;
				count2--;
			}

		}

		count1 = 0;
		count2 = 0;

		for (int i = 0; i < arrayLength; i++) {
			int currentElement = nums[i];
			if (candidate1 == currentElement) {
				count1++;
			}

			if (candidate2 == currentElement) {
				count2++;
			}
		}

		if (count1 > arrayLength / 3) {
			majorityElementList.add(candidate1);
		}

		if (count2 > arrayLength / 3) {
			majorityElementList.add(candidate2);
		}

		return majorityElementList;
	}

	public static void main(String[] args) {
		MajorityElementII majorityElementII = new MajorityElementII();

		// int arr[] = { 3, 2, 3 };

		int arr[] = { 1000000000, 1000000000 };
		List<Integer> aMajorityElements = majorityElementII.majorityElement(arr);

		System.out.println(aMajorityElements);
	}

}
