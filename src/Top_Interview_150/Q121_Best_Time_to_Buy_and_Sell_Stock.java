package Top_Interview_150;

public class Q121_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > max){
                max = prices[i] - minPrice;
            }
        }
        return max;
    }
}
