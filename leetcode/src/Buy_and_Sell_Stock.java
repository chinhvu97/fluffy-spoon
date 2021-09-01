/**
 * 121 leetcode
 */
public class Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int result = 0;
        int bought = prices[0];
        if (prices.length == 1) return  0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bought) {
                if (prices[i] - bought > result) { //sell
                    result = prices[i] - bought;
                }
            }
            else {
                bought = prices[i];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
