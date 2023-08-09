package Top_Interview_150;

import java.util.HashMap;
import java.util.HashSet;

public class Q290_Word_Pattern {
    public static void main(String[] args) {

    }
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> char2String = new HashMap<>();
        HashMap<String, Character> string2Char = new HashMap<>();

        if(pattern.length() != words.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(char2String.containsKey(ch)){
                if(!char2String.get(ch).equals(word)){
                    return false;
                }
            }else{
                char2String.put(ch,word);
            }

            if(string2Char.containsKey(word)){
                if(string2Char.get(word) != ch){
                    return false;
                }
            }else{
                string2Char.put(word,ch);
            }
        }
        return true;
    }
}
