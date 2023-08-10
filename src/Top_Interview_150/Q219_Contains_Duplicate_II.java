package Top_Interview_150;

import java.util.HashMap;

public class Q219_Contains_Duplicate_II {
    public static void main(String[] args) {

    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                if(Math.abs(hashMap.get(nums[i]) - i) <= k){
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
