package Top_Interview_150;

import java.util.HashMap;

public class Q242_Valid_Anagram {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
//        int[] check = new int[26];
//        if(s.length() != t.length()){
//            return false;
//        }
//        for(int i = 0; i < s.length(); i++){
//            check[s.charAt(i) - 'a']++;
//            check[t.charAt(i) - 'a']--;
//        }
//        for(int i = 0; i < check.length; i++){
//            if(check[i] != 0){
//                return false;
//            }
//        }
//        return true;

        //solve by hashmap
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!hashMap.containsKey(c)){
                return false;
            }
            hashMap.put(c, hashMap.get(c) - 1);
            if(hashMap.get(c) == 0){
                hashMap.remove(c);
            }
        }
        return hashMap.isEmpty();
    }
}
