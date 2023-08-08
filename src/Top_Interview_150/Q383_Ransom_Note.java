package Top_Interview_150;

import java.util.HashMap;

public class Q383_Ransom_Note {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {
//        if(magazine.length() < ransomNote.length()){
//            return false;
//        }
//        HashMap<Character,Integer> hashMap = new HashMap<>();
//
//        for(int i = 0; i < magazine.length(); i++){
//                hashMap.put(magazine.charAt(i), hashMap.getOrDefault(magazine.charAt(i),0) + 1);
//        }
//        for(int i = 0; i < ransomNote.length(); i++){
//            if(hashMap.containsKey(ransomNote.charAt(i)) && hashMap.get(ransomNote.charAt(i)) > 0){
//                hashMap.put(ransomNote.charAt(i), hashMap.get(ransomNote.charAt(i)) - 1);
//            }else{
//                return false;
//            }
//        }
//        return true;

        //a better way of solving this
        int[] counts = new int[26];
        for(char m : magazine.toCharArray()){
            counts[m - 'a']++;
        }
        for(char r : ransomNote.toCharArray()){
            if(--counts[r - 'a'] < 0){
                return false;
            }
        }
        return true;

        /*
        --counts[c - 'a'] < 0:
        This is a pre-decrement operation. It first decrements the value at counts[c - 'a'] and then compares the decremented value to 0.

        counts[c - 'a']-- < 0:
        This is a post-decrement operation. It first compares the current value of counts[c - 'a'] to 0, and then it decrements the value.
         */
    }
}
