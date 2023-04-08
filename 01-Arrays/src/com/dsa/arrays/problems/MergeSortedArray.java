package com.dsa.arrays.problems;

/**
 * https://leetcode.com/problems/merge-sorted-array/ Input: nums1 =
 * [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output: [1,2,2,3,5,6]
 * 
 * @author IND
 *
 */
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int lengthOftheNewArray = m + n;
		int tLastIndex = lengthOftheNewArray - 1;

		for (int i = 0; i < lengthOftheNewArray; i++) {
			// int nextArrayElement = nums2[i];
			if (i < n) {
				nums1[tLastIndex - i] = nums2[i];
			}
		}

		for (int i = 0; i < nums1.length; i++) {
			for (int j = i + 1; j < nums1.length; j++) {
				if (nums1[i] > nums1[j]) {
					int temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int nums2[] = { 2, 5, 6 };
		int n = 3;

		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		mergeSortedArray.merge(nums1, m, nums2, n);
		for (int i : nums1) {
			System.out.println(i);
		}

	}

}
