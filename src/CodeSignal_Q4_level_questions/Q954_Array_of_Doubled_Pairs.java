package CodeSignal_Q4_level_questions;

import java.util.Arrays;
import java.util.HashMap;

public class Q954_Array_of_Doubled_Pairs {
    public static void main(String[] args) {

    }
    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num : arr){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(arr);
        for(int num : arr){
            if(hashMap.get(num) == 0){
                continue;
            }
            if(num < 0 && num % 2 != 0){
                return false;
            }
            int target = num < 0 ? num / 2 : num * 2;
            if (hashMap.getOrDefault(target, 0) == 0){
                return false;
            }
            // Pair found, update the counts
            hashMap.put(num, hashMap.get(num) - 1);
            hashMap.put(target, hashMap.get(target) - 1);
        }
        return true;
    }
}
