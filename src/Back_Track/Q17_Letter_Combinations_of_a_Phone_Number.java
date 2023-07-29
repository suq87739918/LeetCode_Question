package Back_Track;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static javax.swing.UIManager.put;

public class Q17_Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {

    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc"); put('3', "def"); put('4', "ghi");
            put('5', "jkl"); put('6', "mno"); put('7', "pqrs");
            put('8', "tuv"); put('9', "wxyz");
        }};
        List<String> output = new ArrayList<>();
        if(digits.isEmpty()){
            return output;
        }
        recursion(phoneMap, digits, output, 0, "");
        return output;
    }
    private void recursion(HashMap<Character, String> phoneMap, String digits, List<String> output, int index, String combinations){
        //case when stop recursion
        if(index == digits.length()){
            output.add(combinations);
            return;
        }
        String letters = phoneMap.get(digits.charAt(index));
        for(char letter : letters.toCharArray()){
            recursion(phoneMap, digits, output, index+1, combinations + letter);
        }
    }
}
