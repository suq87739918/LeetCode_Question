package Top_Interview_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i] != nums[i - 1]) {
                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while (left <= right) {
                    List<Integer> sublist = new ArrayList<>();
                    if (nums[left] + nums[right] == target) {
                        sublist.add(nums[i]);
                        sublist.add(nums[left]);
                        sublist.add(nums[right]);
                        output.add(sublist);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return output;
    }
}
