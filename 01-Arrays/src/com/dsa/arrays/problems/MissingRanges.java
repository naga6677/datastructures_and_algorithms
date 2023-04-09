package com.dsa.arrays.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array nums, where the range of elements are in the
 * inclusive range [lower, upper], return its missing ranges.
 * 
 * Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
 * 
 * Output: ["2","4->49", "51->74", "76->99"]
 * 
 * @author Naga Venkateswara Rao Ede
 *
 */
public class MissingRanges {

	public List<String> findMissingRanges(int[] nums, int lower, int upper) {

		List<String> aMissedRanges = new ArrayList<String>();
		int arrayLength = nums.length;

		for (int i = 0; i < arrayLength; i++) {

			int currentElement = nums[i];
			if (lower != currentElement) {
				aMissedRanges.add(getRange(lower, currentElement - 1));
				lower = currentElement + 1;
			} else {
				lower++;
			}
		}

		if (lower < upper) {
			aMissedRanges.add(getRange(lower, upper));
		}

		return aMissedRanges;
	}

	public String getRange(int n1, int n2) {
		return n1 == n2 ? String.valueOf(n1) : String.format("%d->%d", n1, n2);
	}

	public static void main(String[] args) {

		MissingRanges missingRanges = new MissingRanges();
		int arr[] = { 0, 1, 3, 50, 75 };
		List<String> tmissingRanges = missingRanges.findMissingRanges(arr, 0, 99);

		System.out.println(tmissingRanges);

	}

}
