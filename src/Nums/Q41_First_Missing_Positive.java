package Nums;

import java.util.HashSet;

public class Q41_First_Missing_Positive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int missing = 1;  //positive
        for(int num : nums){
            if(num > 0){
                hashSet.add(num);
            }
        }
        while(hashSet.contains(missing)){
            missing++;
        }
        return missing;
    }
}
