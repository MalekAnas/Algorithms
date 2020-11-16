package se.black_lemon.problems_easy;

public class BestTimeByeSellStock {


    //Say you have an array prices for which the ith element is the price of a given stock on day i.
    //
    //Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
    //
    //Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

    //Example 1:
    //
    //Input: [7,1,5,3,6,4]
    //Output: 7
    //Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    //             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

    public static void main(String[] args) {


        int[] prices ={7,1,5,3,6,4};


        System.out.println("Max profit is: " + maxProfit(prices));
    }




    public static  int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }

    public static int calculate(int prices[], int s) {
        if (s >= prices.length)
            return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }
}
