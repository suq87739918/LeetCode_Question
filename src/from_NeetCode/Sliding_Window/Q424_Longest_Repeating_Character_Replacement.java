public class Q424_Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        String s1 = "AABAB";
        System.out.println(characterReplacement(s1, 2));
    }
    public static int characterReplacement(String s, int k){
        int[] array = new int[26];
        int maxCount = 0;
        int start = 0;
        int output = 0;
        for(int end = 0; end < s.length(); end++){
            array[s.charAt(end) - 'A']++;
            maxCount = Math.max(array[s.charAt(end) - 'A'], maxCount);
            if((end - start + 1) - maxCount > k){
                array[s.charAt(end) - 'A']--;
                start++;
            }
            output = Math.max((end - start + 1), output);
        }
        return output;
    }
}
