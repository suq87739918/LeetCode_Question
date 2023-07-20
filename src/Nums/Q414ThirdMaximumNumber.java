package Nums;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Q414ThirdMaximumNumber {
    public static void main(String[] args) {

    }
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = nums.length - 1; i > 0; i--){
            hashSet.add(nums[i]);
            if(hashSet.size() == 3){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
