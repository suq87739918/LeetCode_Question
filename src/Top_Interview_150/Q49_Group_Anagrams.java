package Top_Interview_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49_Group_Anagrams {
    public static void main(String[] args) {

    }
    public List<List<String>>  groupAnagrams(String[] strs) {
        if (strs.length == 0){
            return new ArrayList();
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(String s : strs){
            char[] s2char = s.toCharArray();
            Arrays.sort(s2char);
            String key = String.valueOf(s2char);
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, new ArrayList());
            }
            hashMap.get(key).add(s);
        }
        return new ArrayList(hashMap.values());
    }
}
