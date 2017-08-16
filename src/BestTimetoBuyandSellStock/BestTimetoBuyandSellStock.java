package BestTimetoBuyandSellStock;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.print(new BestTimetoBuyandSellStock().maxProfit(price));
    }
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int maxrecv = -prices[0];
        int small = prices[0];
        for(int i = 0;i<prices.length;i++)
        {
            small = Math.min(small,prices[i]);
            maxrecv = Math.max(maxrecv,prices[i]-small);
        }
        return maxrecv;
    }
}
