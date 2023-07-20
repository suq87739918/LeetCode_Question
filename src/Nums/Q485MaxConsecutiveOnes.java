package Nums;

public class Q485MaxConsecutiveOnes {
    public static void main(String[] args) {

    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxValue = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxValue = Math.max(count, maxValue);
            }else if(nums[i] == 0){
                count = 0;
            }
        }
        return maxValue;
    }
}
