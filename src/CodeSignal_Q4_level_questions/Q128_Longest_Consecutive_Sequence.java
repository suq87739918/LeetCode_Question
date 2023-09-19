package CodeSignal_Q4_level_questions;

import java.util.HashSet;

public class Q128_Longest_Consecutive_Sequence {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int longest = 0;
        for(int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }
        for(int num : nums){
            if(!hashSet.contains(num - 1)) {
                int currNum = num;
                int currLength = 1;
                while (hashSet.contains(currNum + 1)) {
                    currNum = currNum + 1;
                    currLength++;
                }
                longest = Math.max(currLength, longest);
            }
        }
        return longest;
    }
}
