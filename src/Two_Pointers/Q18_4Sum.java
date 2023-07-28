package Two_Pointers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_4Sum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return res;

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger target2 = BigInteger.valueOf(target).subtract(BigInteger.valueOf(nums[i])).subtract(BigInteger.valueOf(nums[j]));
                int front = j + 1;
                int back = n - 1;

                while (front < back) {
                    BigInteger two_sum = BigInteger.valueOf(nums[front]).add(BigInteger.valueOf(nums[back]));
                    if (two_sum.compareTo(target2) < 0) front++;
                    else if (two_sum.compareTo(target2) > 0) back--;
                    else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);

                        // Skip duplicate numbers of index second
                        while (front < back && nums[front] == quad.get(2)) ++front;

                        // Skip duplicate numbers of index forth
                        while (front < back && nums[back] == quad.get(3)) --back;
                    }
                }

                // Skip duplicate numbers of index j
                while(j + 1 < n && nums[j + 1] == nums[j]) ++j;
            }
            // Skip duplicate numbers of index i
            while (i + 1 < n && nums[i + 1] == nums[i]) ++i;
        }

        return res;
    }
}
