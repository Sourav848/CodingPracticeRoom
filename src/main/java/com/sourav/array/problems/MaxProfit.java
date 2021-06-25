package com.sourav.array.problems;


//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
class MaxProfit {
	public static int maxProfit(int[] prices) {
		int n = prices.length;
		int min = Integer.MAX_VALUE;
		int maxprofit = 0;

		for (int i = 0; i < n; i++) {
			if (prices[i] < min)
				min = prices[i];
			else if (prices[i] - min > maxprofit)
				maxprofit = prices[i] - min;
		}

		return maxprofit;
	}

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int maxpr = maxProfit(prices);
		System.out.println("Best Time to sell stock is :" + maxpr);
	}
}