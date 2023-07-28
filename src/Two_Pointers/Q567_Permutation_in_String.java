package Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q567_Permutation_in_String {
    public static void main(String[] args) {

    }
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        if(s1.length() > s2.length()){
            return false;
        }
        int left = 0;
        int right = s1.length() - 1;
        for(int i = 0; i < s1.length(); i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        while(right < s2.length()){
            if(Arrays.equals(s1Count, s2Count)){
                return true;
            }
            right++;
            if(right != s2.length()){
                s2Count[s2.charAt(right) - 'a']++;
                s2Count[s2.charAt(left) - 'a']--;
                left++;
            }
        }
        return false;
    }
}
