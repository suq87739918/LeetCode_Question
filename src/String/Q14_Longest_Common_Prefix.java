package String;

import java.util.Arrays;

public class Q14_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] s1 = {"flower", "flow", "flight"};
        String[] s2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int count = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while(count < first.length()){
            if(first.charAt(count) == last.charAt(count)){
                count++;
            }else{
                break;
            }
        }
        return count == 0 ? "" : first.substring(0, count);
    }
}
