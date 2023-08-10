package Top_Interview_150;

import java.util.HashSet;

public class Q128_Longest_Consecutive_Sequence {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }
        for(int num : hashSet){
            if(!hashSet.contains(num - 1)) {
                int currNum = num;
                int currLength = 1;

                while(hashSet.contains(currNum + 1)){
                    currNum = currNum + 1;
                    currLength++;
                }
                longestLength = Math.max(longestLength, currLength);
            }
        }
        return longestLength;
    }
}
