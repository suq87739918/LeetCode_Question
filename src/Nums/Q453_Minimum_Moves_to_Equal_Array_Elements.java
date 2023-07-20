package Nums;

import java.util.Arrays;

public class Q453_Minimum_Moves_to_Equal_Array_Elements {
    public static void main(String[] args) {

    }
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            moves += nums[i] - min;
        }
        return moves;
    }
}
