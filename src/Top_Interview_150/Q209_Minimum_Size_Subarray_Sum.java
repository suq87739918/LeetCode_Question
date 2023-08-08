package Top_Interview_150;

public class Q209_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;

        while(right < nums.length){
            sum += nums[right];
            if(sum >= target){
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left--;
            }else{
                right++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
