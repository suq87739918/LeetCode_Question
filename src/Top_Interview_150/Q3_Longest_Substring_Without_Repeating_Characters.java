package Top_Interview_150;

import java.util.HashSet;

public class Q3_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int count = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(hashSet.contains(c)){
                hashSet.remove(c);
                left++;
            }
            hashSet.add(c);
            count = Math.max(count, right - left + 1);
        }
        return count;
    }
}
