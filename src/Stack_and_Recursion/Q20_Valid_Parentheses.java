package Stack_and_Recursion;

import java.util.HashMap;
import java.util.Stack;

public class Q20_Valid_Parentheses {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        hashMap.put('}', '{');
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if(stack.size() == 0 || hashMap.get(s.charAt(i)) != stack.pop()){
                return false;
            }
        }
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}

//在Java中，方法的调用是在运行时动态执行的，包括在if条件判断语句中。
// 当 stack.pop() 在if条件语句中被调用时，它将从栈顶移除并返回一个元素。这个过程不仅会影响判断条件的结果，也会改变栈的状态。

/*
Input: s = "()[]{}"
Output: true
 */
