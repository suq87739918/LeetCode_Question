public class Q242_Valid_Anagram {
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String s, String t){
        int[] store = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }
        for(int n : store){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}
