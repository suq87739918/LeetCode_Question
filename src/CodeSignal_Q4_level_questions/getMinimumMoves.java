package CodeSignal_Q4_level_questions;

public class getMinimumMoves {
    public static void main(String[] args) {
        int[] quantity = {1, 4, 4};
        int result = getMinimumMoves(quantity);
        System.out.println("Minimum moves: " + result);
    }
    public static int getMinimumMoves(int[] quantity){
        int totalQuantity = 0;
        for(int item : quantity){
            totalQuantity += item;
        }
        int minMoves = Integer.MAX_VALUE;
        int firstBatchSum = 0;
        for(int i = 0; i < quantity.length - 1; i++){
            firstBatchSum += quantity[i];
            int secondBatchSum = totalQuantity - firstBatchSum;
            int moves = Math.abs(firstBatchSum - secondBatchSum);
            minMoves = Math.min(moves, minMoves);
        }
        return minMoves;
    }
}
