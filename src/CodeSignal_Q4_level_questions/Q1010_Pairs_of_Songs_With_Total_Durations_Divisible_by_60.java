package CodeSignal_Q4_level_questions;

import java.util.HashMap;

public class Q1010_Pairs_of_Songs_With_Total_Durations_Divisible_by_60 {
    public static void main(String[] args) {

    }
    public int numPairsDivisibleBy60(int[] time) {
        //time complexity too high which is O(n^2)
//        int count = 0;
//        for(int i = 0; i < time.length; i++){
//            for(int j = i + 1; j < time.length; j++){
//                if((time[i] + time[j]) % 60 == 0){
//                    count++;
//                }
//            }
//        }
//        return count;
        //improved method with time complexity O(n)
        HashMap<Integer, Integer> remainders = new HashMap<>();
        int count = 0;

        for(int t : time){
            int remainder = t % 60;
            if(remainder == 0){
                count += remainders.getOrDefault(0, 0);
            }else{
                count += remainders.getOrDefault(60 - remainder, 0);
            }
            remainders.put(remainder, remainders.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
