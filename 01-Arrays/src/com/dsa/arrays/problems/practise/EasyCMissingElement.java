package com.dsa.arrays.problems.practise;

public class EasyCMissingElement {

	public int missingNumber(int[] nums) {

		int tOriginalArrayLength = nums.length;

		int tCurrentElement = 0;
		int tRangeCurrentNumber = 0;

		for (int i = 0; i < tOriginalArrayLength; i++) {

			tCurrentElement = tCurrentElement ^ nums[i];

			tRangeCurrentNumber = tRangeCurrentNumber ^ i;

			if (i + 1 == tOriginalArrayLength) {
				tRangeCurrentNumber = tRangeCurrentNumber ^ (i + 1);
			}

		}

		int tMissedElement = tCurrentElement ^ tRangeCurrentNumber;

		return tMissedElement;

	}

	public static void main(String[] args) {

		EasyCMissingElement tEasyCMissingElement = new EasyCMissingElement();

		int[] tArray = { 0, 2, 1, 3, 5, 6 };

		int tMissedElement = tEasyCMissingElement.missingNumber(tArray);

		System.out.println("The missing element is:" + tMissedElement);

	}

}
