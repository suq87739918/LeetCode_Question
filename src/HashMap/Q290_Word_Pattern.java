package HashMap;

import java.util.HashMap;

public class Q290_Word_Pattern {
    public static void main(String[] args) {

    }
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> hashMap = new HashMap<>();
        if(words.length != pattern.length()){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            char currPattern = pattern.charAt(i);
            if(hashMap.containsKey(currPattern)){
                if(!hashMap.get(currPattern).equals(words[i])){
                    return false;
                }
            }else{
                if(hashMap.containsValue(words[i])){
                    return false;
                }
                hashMap.put(currPattern, words[i]);
            }
        }
        return true;
    }
}
