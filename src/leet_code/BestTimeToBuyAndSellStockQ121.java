package leet_code;

public class BestTimeToBuyAndSellStockQ121 {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStockQ121 bestTimeToBuyAndSellStockQ121 = new BestTimeToBuyAndSellStockQ121();
		int[] array = {7,1,5,3,6,4};
		System.out.println(bestTimeToBuyAndSellStockQ121.maxProfit(array));
	}
	public int maxProfit(int[] prices) {
        int diff = 0;
        int high = prices[prices.length-1];
        for(int i = prices.length-2;i>=0;i--){
            if(high < prices[i]){
                high = prices[i];
            }else{
                if((high-prices[i])>diff){
                    diff = high-prices[i];
                }
            }
        }
        return diff;
    }
}
