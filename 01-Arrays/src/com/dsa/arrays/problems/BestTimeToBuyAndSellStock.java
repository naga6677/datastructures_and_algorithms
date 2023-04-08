package com.dsa.arrays.problems;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * Input: prices = [7,1,5,3,6,4]
 * 
 * Output: 5
 * 
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
 * 6-1 = 5.
 * 
 * Note that buying on day 2 and selling on day 1 is not allowed because you
 * must buy before you sell.
 * 
 * @author IND
 *
 */
public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {

		int originalArrayLength = prices.length;
		int tempArr[] = new int[originalArrayLength];

		int tInitialIndex = originalArrayLength - 1;
		tempArr[tInitialIndex] = prices[tInitialIndex];

		for (int i = tInitialIndex - 1; i >= 0; i--) {

			if (prices[i] < tempArr[i + 1]) {
				tempArr[i] = tempArr[i + 1];
			} else {
				tempArr[i] = prices[i];
			}
		}

		int tMaxprofit = 0;
		for (int i = tInitialIndex - 1; i >= 0; i--) {

			if (tempArr[i] > prices[i]) {
				int tempLargest = tempArr[i] - prices[i];
				if (tempLargest > tMaxprofit) {
					tMaxprofit = tempLargest;
				}
			}
		}

		return tMaxprofit;
	}

	public static void main(String[] args) {
		int stocksArr[] = { 7, 1, 5, 3, 6, 4 };

		BestTimeToBuyAndSellStock tBestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
		int maxProfit = tBestTimeToBuyAndSellStock.maxProfit(stocksArr);

		System.out.println("Max Profit is: " + maxProfit);
	}

}
