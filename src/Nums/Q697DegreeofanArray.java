package Nums;

import java.util.HashMap;

public class Q697DegreeofanArray {
    public static void main(String[] args) {

    }
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> maxDegree = new HashMap<>();
        HashMap<Integer, Integer> firstSeen = new HashMap<>();
        int degree = 0;
        int minLength = 0;
        for(int i = 0; i < nums.length; i++){
            maxDegree.put(nums[i], maxDegree.getOrDefault(nums[i], 0) + 1);
            firstSeen.putIfAbsent(nums[i], i);
            if(maxDegree.get(nums[i]) > degree){
                degree = maxDegree.get(nums[i]);
                minLength = i - firstSeen.get(nums[i]) + 1;
            }else if(maxDegree.get(nums[i]) == degree){
                minLength = Math.min(minLength, i - firstSeen.get(nums[i]) + 1);
            }
        }
        return minLength;
    }
}
