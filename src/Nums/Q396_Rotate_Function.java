package Nums;

public class Q396_Rotate_Function {
    public static void main(String[] args) {

    }
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int rotationSum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            rotationSum += i * nums[i];
        }

        int maxSum = rotationSum;
        for (int i = 1; i < n; i++) {
            rotationSum = rotationSum + sum - n * nums[n - i];
            maxSum = Math.max(maxSum, rotationSum);
        }
        return maxSum;
    }
}
