package BestTimetoBuyandSellStockIII;

public class BestTimetoBuyandSellStockIII {
    public static void main(String[] args) {

        //System.out.print(new BestTimetoBuyandSellStockIII().maxProfit());
    }
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0;i<prices.length;i++)
        {
            for(int j = i+1;j<prices.length;j++)
                profit = Math.max(profit,prices[i]-prices[j]);
        }
        return profit;
    }
}
