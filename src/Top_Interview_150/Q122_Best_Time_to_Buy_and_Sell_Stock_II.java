package Top_Interview_150;

public class Q122_Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0 ; i < prices.length - 1; i++){
            if(prices[i + 1] > prices[i]){
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }
}
