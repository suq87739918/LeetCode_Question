package Nums;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q442FindAllDuplicatesinanArray {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            if(hashSet.contains(num)){
                output.add(num);
            }else{
                hashSet.add(num);
            }
        }
        return output;
    }
}
