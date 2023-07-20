package HashMap;

import java.util.HashMap;

public class Q205_Isomorphic_Strings {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sTot = new HashMap<>();
        HashMap<Character, Character> tTos = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sTot.containsKey(sChar)){
                if(sTot.get(sChar) != tChar){
                    return false;
                }
            }else{
                sTot.put(sChar, tChar);
            }

            if(tTos.containsKey(tChar)){
                if(tTos.get(tChar) != sChar){
                    return false;
                }
            }else{
                tTos.put(tChar, sChar);
            }
        }
        return true;
    }
}
