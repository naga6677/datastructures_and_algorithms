package com.dsa.arrays.problems;

/**
 * https://leetcode.com/problems/majority-element/
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
 * may assume that the majority element always exists in the array.
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3] Output: 3
 * 
 * @author Naga Venkateswara Rao Ede
 *
 */
public class MajorityElement {

	public int majorityElement(int[] nums) {

		int anArrayLength = nums.length;

		int count = 0;
		int candidate = 0;

		for (int i = 0; i < anArrayLength; i++) {
			int currentElement = nums[i];

			if (count == 0) {
				candidate = currentElement;
			}

			if (currentElement == candidate) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
		MajorityElement majorityElement = new MajorityElement();

		int arr[] = { 3, 2, 3, 2 };
		int anElement = majorityElement.majorityElement(arr);

		System.out.println("The Majority Element is: " + anElement);
	}

}
