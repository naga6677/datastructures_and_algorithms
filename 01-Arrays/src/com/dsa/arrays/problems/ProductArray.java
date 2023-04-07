package com.dsa.arrays.problems;

/**
 * Given an array of integers, update every element with multiplication of
 * previous and next elements with following exceptions. a) First element is
 * replaced by multiplication of first and second. b) Last element is replaced
 * by multiplication of last and second last. Input: arr[] = {2, 3, 4, 5, 6}
 * Output: arr[] = {6, 8, 15, 24, 30}
 * 
 * @author IND
 *
 */
public class ProductArray {

	private void productOfElement(int arr[]) {
		int previousElement = arr[0];

		int arrlength = arr.length;

		for (int i = 0; i < arrlength; i++) {
			int temp = arr[i];
			if (i == 0) {
				arr[i] = arr[i] * arr[i + 1];

			} else if (i == arrlength - 1) {
				arr[i] = previousElement * arr[i];
			} else {
				arr[i] = previousElement * arr[i + 1];
			}
			previousElement = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6 };
		
		ProductArray aProductArray = new ProductArray();
		aProductArray.productOfElement(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
