/**
 * 121 leetcode
 */
public class BestTimeStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i-1]) {
                int currentMax = 0;
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] - prices[i] > currentMax) {
                        currentMax = prices[j] - prices[i];
                    }
                }
                if (maxProfit < currentMax) maxProfit = currentMax;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
