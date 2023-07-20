package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q219_Contains_Duplicate_II {
    public static void main(String[] args) {

    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                if(i - hashMap.get(nums[i]) <= k){
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
