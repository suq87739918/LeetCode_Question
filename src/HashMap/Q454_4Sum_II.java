package HashMap;

import java.util.HashMap;

public class Q454_4Sum_II {
    public static void main(String[] args) {

    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int limit = nums1.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < limit; j++){
                int sum = nums1[i] + nums2[j];
                hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
            }
        }
        int count = 0;
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < limit; j++){
                int sum = nums3[i] + nums4[j];
                count += hashMap.getOrDefault(-sum,0);
            }
        }
        return count;
    }
}
