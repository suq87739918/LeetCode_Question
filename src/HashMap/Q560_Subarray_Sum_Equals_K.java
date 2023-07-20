package HashMap;

import java.util.HashMap;

public class Q560_Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);  //cumulative sum is 0, occur 1 times
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum += nums[i];
            if(hashMap.containsKey(sum - k)){
                count += hashMap.get(sum - k);
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
