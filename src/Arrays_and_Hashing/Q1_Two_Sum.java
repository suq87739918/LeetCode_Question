package Arrays_and_Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Q1_Two_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num_Val = nums[i];
            int diff = target - num_Val;
            if(hashMap.containsKey(diff)){
                return new int[] {hashMap.get(diff),i};
            }
            hashMap.put(num_Val, i);
        }
        return new int[] {};
    }
}
