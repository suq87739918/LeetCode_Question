package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Q1_Two_Sum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int remaining = target - nums[i];
            if(hashMap.containsKey(remaining)){
                return new int[] {hashMap.get(remaining), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
