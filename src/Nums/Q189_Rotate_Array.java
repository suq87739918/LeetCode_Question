package Nums;

public class Q189_Rotate_Array {
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
        //make sure k is in the valid range, is k is too large, then we dont need to reverse the whole array
        //if k is larger than the length of the array, we don't need to rotate the array by k full cycles.
        //Instead, we can perform a certain number of rotations that is equivalent to k % nums.length.
        //For instance, if nums is [1, 2, 3, 4, 5] and k is 7, we only need to rotate the array by 2 steps (7 % 5 = 2) to achieve the desired result.
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            //swap start and end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
