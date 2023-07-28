package Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q438_Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<>();
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for(char ch : p.toCharArray()){
            pCount[ch - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            sCount[s.charAt(i) - 'a']++;
            if(i >= p.length()){
                sCount[s.charAt(i - p.length()) - 'a']--;
            }
            if(Arrays.equals(sCount,pCount)){
                output.add(i - p.length() + 1);
            }
        }
        return output;
    }
}
