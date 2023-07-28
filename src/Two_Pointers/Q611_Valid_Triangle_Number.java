package Two_Pointers;

import java.util.Arrays;

public class Q611_Valid_Triangle_Number {
    public static void main(String[] args) {

    }
    public int triangleNumber(int[] nums) {
        //special case
        if (nums == null || nums.length < 3) return 0;
        //O(nlogn)
        Arrays.sort(nums);
        int count = 0;

        for (int i = 2; i < nums.length; i++) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
}
