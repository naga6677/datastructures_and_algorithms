package com.dsa.arrays.problems.practise.easy;

public class AMoveZerosToEnd {

	public int[] moveZeroes(int[] nums) {

		int tLength = nums.length;

		for (int i = 0; i < tLength; i++) {

			int tCurrentElement = nums[i];

			if (tCurrentElement == 0) {

				int tCurrentIndex = i;

				for (int j = tCurrentIndex; j < tLength; j++) {

					if (j + 1 < tLength) {
						int tNextElement = nums[j + 1];
						if (tNextElement != 0) {
							int tTemp = nums[i];
							nums[j + 1] = tTemp;
							nums[i] = tNextElement;
							break;
						}
					}

				}
			}

		}

		return nums;
	}

	public static void main(String[] args) {
		AMoveZerosToEnd tMoveZerosToEnd = new AMoveZerosToEnd();
		int[] tArray = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };

		tArray = tMoveZerosToEnd.moveZeroes(tArray);
		for (int i = 0; i < tArray.length; i++) {
			System.out.println(tArray[i]);
		}

	}

}
