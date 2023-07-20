package Sliding_Window;

import java.util.Arrays;

public class Q567_Permutation_in_String {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        String s3 = "ab";
        String s4 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
        System.out.println(checkInclusion(s3,s4));
    }
    public  static boolean checkInclusion(String s1, String s2) {
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        int left = 0;
        int right = s1.length() - 1;
        if(s1.length() > s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            a1[s1.charAt(i) - 'a']++;
            a2[s2.charAt(i) - 'a']++;
        }
        while(right < s2.length()){
            if(Arrays.equals(a1, a2)){
                return true;
            }
            right++;
            if(right != s2.length()){
                a2[s2.charAt(right) - 'a']++;
                a2[s2.charAt(left) - 'a']--;
                left++;
            }
        }
        return false;
    }
}
