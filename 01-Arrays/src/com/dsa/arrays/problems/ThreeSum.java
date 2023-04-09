package com.dsa.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * https://leetcode.com/problems/3sum/
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
 * nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * Input: nums = [-1,0,1,2,-1,-4]
 * 
 * Output: [[-1,-1,2],[-1,0,1]]
 * 
 * Explanation:
 * 
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * 
 * nums[1] + * nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * 
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * 
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * 
 * Notice that the order of the output and the order of the triplets does not
 * matter.
 * 
 * @author Naga Venkateswara Rao Ede
 *
 */
public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Arrays.sort(nums); //Sorted the Array
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int p = i + 1;
			int q = n - 1;
			while (p < q) {
				if (nums[p] + nums[q] == -nums[i]) {
					List<Integer> t = new ArrayList<Integer>();
					t.add(nums[i]);
					t.add(nums[p]);
					t.add(nums[q]);

					ans.add(t);

					while (p + 1 < q && nums[p + 1] == nums[p]) {
						p++;
					}
					while (q - 1 > p && nums[q - 1] == nums[q]) {
						q--;
					}

					p++;
					q--;
				} else if (nums[p] + nums[q] < -nums[i]) {
					p++;
				} else {
					q--;
				}
			}

			while (i + 1 < n && nums[i + 1] == nums[i]) {
				i++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		ThreeSum threeSum = new ThreeSum();
		int[] nums = { -1, 0, 1, 2, -1, -4 };

		for (List<Integer> list : threeSum.threeSum(nums)) {
			for (int x : list)
				System.out.print(x + " ");
			System.out.println();
		}

	}

}
