package CodeSignal_Q4_level_questions;

import java.util.HashMap;

public class Q454_4Sum_II {
    public static void main(String[] args) {

    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int maxLength = nums1.length;
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < maxLength; i++){
            for(int j = 0; j < maxLength; j++){
                int sum = nums1[i] + nums2[j];
                hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
            }
        }
        for(int i = 0; i < maxLength; i++){
            for(int j = 0; j < maxLength; j++){
                int sum = nums3[i] + nums4[j];
                count += hashMap.getOrDefault(-sum, 0);
            }
        }
        return count;
    }
}
