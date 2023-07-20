package Two_Pointers;

import java.util.Arrays;

public class Q16_3Sum_Closest {
    public static void main(String[] args) {

    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];    //just a random sum
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int currSum = nums[i] + nums[left] + nums[right];
                if(currSum > target){
                    right--;
                }else{
                    left++;
                }
                if(Math.abs(currSum - target) < Math.abs(closestSum - target)){
                    closestSum = currSum;
                }
            }
        }
        return closestSum;
    }
}
