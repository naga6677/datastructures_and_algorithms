package com.dsa.arrays.problems;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 * 
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i]. You must
 * write an algorithm that runs in O(n) time and without using the division
 * operation.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4] Output: [24,12,8,6]
 * 
 * @author Naga Venkateswara Rao Ede
 *
 */
public class ProductOfOtherElementsInTheArray {

	private void productOfElements(int nums[]) {

		int originalArrayLength = nums.length;
		int lastIndex = originalArrayLength - 1;

		int lhsArr[] = new int[originalArrayLength];
		int rhsArr[] = new int[originalArrayLength];

		lhsArr[0] = 1;
		rhsArr[lastIndex] = 1;

		for (int i = 1; i < originalArrayLength; i++) {

			lhsArr[i] = lhsArr[i - 1] * nums[i - 1];

			int rhsCurrentIndex = lastIndex - i;
			rhsArr[rhsCurrentIndex] = rhsArr[rhsCurrentIndex + 1] * nums[rhsCurrentIndex + 1];
		}

		for (int i = 0; i < originalArrayLength; i++) {
			nums[i] = lhsArr[i] * rhsArr[i];
		}

		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };

		ProductOfOtherElementsInTheArray pooe = new ProductOfOtherElementsInTheArray();
		pooe.productOfElements(nums);

	}

}
