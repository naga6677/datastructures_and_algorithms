package com.dsa.arrays.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 * 
 * Input: numRows = 5
 * 
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 
 * @author Naga Venkateswara Rao Ede
 *
 */
public class PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();

		List<Integer> aList = new ArrayList<Integer>();
		aList.add(1);
		pascalTriangle.add(aList);

		if (numRows > 1) {
			List<Integer> asList = new ArrayList<Integer>();
			asList.add(1);
			asList.add(1);
			pascalTriangle.add(asList);

			for (int i = 2; i < numRows; i++) {

				List<Integer> tempList = pascalTriangle.get(i - 1);
				if (pascalTriangle.get(i - 1) != null) {
					List<Integer> aTempList = new ArrayList<Integer>();
					aTempList.add(1);

					for (int j = 1; j < i; j++) {

						int elementToAdd = tempList.get(j - 1);
						int NextElementToAdd = tempList.get(j);
						aTempList.add(elementToAdd + NextElementToAdd);
					}
					aTempList.add(1);
					pascalTriangle.add(aTempList);
				}
			}
		}
		return pascalTriangle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numRows = 5;

		PascalsTriangle pascalsTriangle = new PascalsTriangle();
		List<List<Integer>> pascalTraingle = pascalsTriangle.generate(numRows);
		System.out.println(pascalTraingle);
	}

}
