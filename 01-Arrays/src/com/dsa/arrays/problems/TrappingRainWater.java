package com.dsa.arrays.problems;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * 
 * Given n postive integer in an array where each represent a bar of width 1.
 * calculate how much water it is able to trap.
 * 
 * i/p: 1 3 0 1 2 0 4 1 2
 * 
 * i/p: { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 } o/p: 6
 * 
 * https://onedrive.live.com/view.aspx?resid=2A3D3FAF1E1EB503!138&authkey=!APBs2BzGHCW4e08
 * 
 * @author IND
 *
 */
public class TrappingRainWater {

	private void calculateTheWater(int height[]) {
		int arrayLength = height.length;
		int lastIndex = arrayLength - 1;

		int leftArr[] = new int[arrayLength];
		int rightArr[] = new int[arrayLength];

		leftArr[0] = height[0];
		rightArr[lastIndex] = height[lastIndex];

		int totalCount = 0;

		for (int i = 1; i < arrayLength; i++) {
			leftArr[i] = height[i] > leftArr[i - 1] ? height[i] : leftArr[i - 1];
			rightArr[lastIndex - i] = height[lastIndex - i] > rightArr[lastIndex - i + 1] ? height[lastIndex - i]
					: rightArr[lastIndex - i + 1];
		}

		for (int i = 0; i < arrayLength; i++) {

			int minimumBar = leftArr[i] < rightArr[i] ? leftArr[i] : rightArr[i];
			totalCount = totalCount + minimumBar - height[i];
		}

		System.out.println("Total Water: " + totalCount);

	}

	public static void main(String[] args) {
		int originalArray[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		TrappingRainWater tTrappingRainWater = new TrappingRainWater();
		tTrappingRainWater.calculateTheWater(originalArray);

	}

}
