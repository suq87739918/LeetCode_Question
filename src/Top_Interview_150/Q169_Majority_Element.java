package Top_Interview_150;

import java.util.HashMap;

public class Q169_Majority_Element {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int majorityCheck = nums.length / 2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
            if(hashMap.get(nums[i]) > majorityCheck){
                return nums[i];
            }
        }
        return -1;  // This line will never be reached as per the problem's assumption
    }
}
