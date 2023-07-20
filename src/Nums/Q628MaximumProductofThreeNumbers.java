package Nums;

import java.util.Arrays;

public class Q628MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        //nums = [-1,-2,-3] output = -6
        //nums = [3, 0,-1,-2,-3] => [-3, -2, -1, 0, 3], output = 0
    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int case1 = nums[0] * nums[1] * nums[nums.length - 1];
        int case2 = nums[nums.length -1 ] * nums[nums.length - 2] * nums[nums.length - 3];
        int output = Math.max(case1, case2);
        return output;
    }
}
