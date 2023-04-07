package com.dsa.arrays.problems;

/**
 * given an array replace every element by greater element on right side (not
 * including the current element) I/p: 16 17 4 3 5 2 O/P: 17 5 5 5 2 -1
 * 
 * @author IND
 *
 */
public class ReplaceElementsWithGreaterElement {

	private int[] replaceWithGreater(int[] originalArray) {

		int previouslyReplacedElement = originalArray[originalArray.length - 1];
		originalArray[originalArray.length - 1] = -1;

		for (int i = originalArray.length - 2; i >= 0; i--) {

			int temp = originalArray[i + 1];
			if (previouslyReplacedElement > originalArray[i + 1]) {
				temp = previouslyReplacedElement;
			}
			previouslyReplacedElement = originalArray[i];
			originalArray[i] = temp;
		}

		return originalArray;
	}

	public static void main(String[] args) {
		int[] originalArray = { 16, 17, 4, 3, 5, 2 };

		ReplaceElementsWithGreaterElement rege = new ReplaceElementsWithGreaterElement();
		rege.replaceWithGreater(originalArray);

		for (int i : originalArray) {
			System.out.println(i);
		}

	}

}
