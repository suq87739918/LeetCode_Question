package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q350_Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        int k = 0;
        for(int num1 : nums1){
            hashMap.put(num1, hashMap.getOrDefault(num1, 0) + 1);
        }
        for(int i = 0; i < nums2.length; i++){
            if(hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i]) > 0){
                nums1[k] = nums2[i];
                k++;
            }
            hashMap.put(nums2[i], hashMap.getOrDefault(nums2[i], 0) - 1);
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
