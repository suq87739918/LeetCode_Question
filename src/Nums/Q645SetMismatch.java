package Nums;

import java.util.HashSet;

public class Q645SetMismatch {
    public static void main(String[] args) {

    }
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int duplicate = -1;
        int missing = -1;
        for(int num : nums){
            if(hashSet.contains(num)){
                duplicate = num;
            }
            hashSet.add(num);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!hashSet.contains(i)){
                missing = i;
                break;
            }
        }
        return new int[]{duplicate, missing};
    }
}
