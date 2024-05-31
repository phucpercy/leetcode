package java_solution;

public class BestTimeBuySellStock {

  // Time complexity: O(n)
  // Space complexity: O(1)
  public int maxProfit(int[] prices) {
    int res = 0;
    int bestBuy = prices[0];

    for (int i = 1; i < prices.length; ++i) {
      bestBuy = Math.min(bestBuy, prices[i]);
      res = Math.max(res, prices[i] - bestBuy);
    }

    return res;
  }

  // Time complexity: O(n)
  // Space complexity: O(1)
  public int maxProfit2(int[] prices) {
    int res = 0;
    int currentBuy = prices[0];

    for (int i = 1; i < prices.length; ++i) {
      if (prices[i] > currentBuy) {
        res += prices[i] - currentBuy;
      }
      currentBuy = prices[i];
    }

    return res;
  }
}
