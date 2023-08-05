package Top_Interview_150;

import java.util.Arrays;

public class Q14_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];
        int count = 0;

        while(count <= firstWord.length()){
            if(firstWord.charAt(count) == lastWord.charAt(count)){
                count++;
            }else{
                break;
            }
        }
        return count == 0 ? "" : lastWord.substring(0,count);
    }
}
