package BestTimetoBuyandSellStockII;

public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] price = {3,2,4,5,2,5};
        System.out.println(new BestTimetoBuyandSellStockII().maxProfit(price));
    }
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
                profit += prices[i+1]-prices[i];
        }
        return profit;
    }
}
