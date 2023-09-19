package CodeSignal_Q4_level_questions;

public class Q1248_Count_Number_of_Nice_Subarrays {
    public static void main(String[] args) {

    }
//    public int numberOfSubarrays(int[] nums, int k) {
//        //by prefix method, time complexity O(n)
//
//    }

    //by brute force method, time complexity O(n^3)
//    public int numberOfSubarrays(int[] nums, int k) {
//        int count = 0;
//        for(int start = 0; start < nums.length; start++){
//            for(int end = start + 1; end < nums.length; end++){
//                int sum = 0;
//                for(int i = start; i < end; i++){
//                    if((nums[i] & 1) == 1){
//                        sum++;
//                    }
//                }
//                if(sum == k){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
}
