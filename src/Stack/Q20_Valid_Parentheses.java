package Stack;

import java.util.HashMap;
import java.util.Stack;

public class Q20_Valid_Parentheses {
    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
    public static boolean isValid(String s){
        HashMap<Character,Character> hashMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        hashMap.put('}', '{');
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.size() == 0 || stack.pop() != hashMap.get(s.charAt(i))){
                return false;
            }
        }
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}
