package com.dsa.arrays.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * 1-Indexed Array starts from 1. We need add 1 to every Index once we
 * identified the Indexes.
 * 
 * Input: numbers = [2,7,11,15], target = 9 Output: [1,2]
 * {firstIndex+1,secondIndex+1}
 * 
 * @author IND
 *
 */
public class TwoSumII {

	public int[] twoSum(int[] numbers, int target) {

		int arrayLength = numbers.length;
		Map<Integer, Integer> aMap = new HashMap<>();
		int tempArr[] = new int[2];

		for (int i = 0; i < arrayLength; i++) {
			int currentElemet = numbers[i];
			int remaider = target - currentElemet;

			Integer index = aMap.get(remaider);

			if (index != null) {
				tempArr[0] = index + 1;
				tempArr[1] = i + 1;
				break;
			} else {
				aMap.put(currentElemet, i);
			}
		}

		return tempArr;
	}

	public static void main(String[] args) {
		int anArray[] = { 2, 7, 11, 15 };
		int target = 9;
		
		TwoSumII twosumII = new TwoSumII();
		anArray = twosumII.twoSum(anArray, target);
		
		for (int i : anArray) {
			System.out.println(i);
		}
		
	}

}
