package com.dsa.arrays.problems.practise.easy;

public class BZigzagFashion {

	public int[] zigzag(int[] arr) {

		int tArraLength = arr.length;

		for (int i = 0; i < tArraLength - 1; i++) {

			if (i % 2 == 0) {

				if (arr[i] > arr[i + 1]) {

					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}

			} else {

				if (arr[i] < arr[i + 1]) {

					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}

			}

		}

		return arr;
	}

	public static void main(String[] args) {
		BZigzagFashion tZigzagFashion = new BZigzagFashion();
		
		int[] tArray = { 4, 3, 7, 8, 6, 2, 1 };
		tArray = tZigzagFashion.zigzag(tArray);

		for (int i = 0; i < tArray.length; i++) {
			System.out.println(tArray[i]);
		}

	}

}
