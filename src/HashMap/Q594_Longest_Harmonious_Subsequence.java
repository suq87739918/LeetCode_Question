package HashMap;

import java.util.HashMap;

public class Q594_Longest_Harmonious_Subsequence {
    public static void main(String[] args) {

    }
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        for(int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for(int diffNum : hashMap.keySet()){
            if(hashMap.containsKey(diffNum + 1)){
                maxLength = Math.max(maxLength, hashMap.get(diffNum) + hashMap.get(diffNum + 1));
            }
        }
        return maxLength;
    }
}
