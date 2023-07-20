package Nums;

public class Q665_Non_decreasing_Array {
    public static void main(String[] args) {

    }
    public boolean checkPossibility(int[] nums) {
        int error = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){

                //for example: nums = [3,4,2,1], i = 1 which is 4 in nums, need to make sure nums[i - 1] <= nums[i + 1] to be true to change index i to make it non decreasing
                //similarly, nums = [3,4,2,8], i = 1 which is 4 in nums, need to make sure nums[i] <= nums[i + 2] to make sure we can change nums[i + 1] to make it non decreasing
                if(error++ > 0 || (i > 1 && i < nums.length - 1 && nums[i - 1] > nums[i + 1] && nums[i - 2] > nums[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
