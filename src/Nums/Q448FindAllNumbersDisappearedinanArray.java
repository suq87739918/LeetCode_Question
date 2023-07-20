package Nums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q448FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!hashSet.contains(i)){
                output.add(i);
            }
        }
        return output;
    }
}
