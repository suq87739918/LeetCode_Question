package Stack_and_Recursion;

import java.util.Stack;

public class Q227_Basic_Calculator_II {
    public static void main(String[] args) {

    }
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char operation = '+';
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(Character.isDigit(current)){
                num = num * 10 + (current - '0');
            }
            if(!Character.isDigit(current) && !Character.isWhitespace(current) || i == s.length() - 1){
                if(operation == '-'){
                    stack.push(-num);
                }else if(operation == '+'){
                    stack.push(num);
                }else if(operation == '*'){
                    stack.push(stack.pop() * num);
                }else if(operation == '/'){
                    stack.push(stack.pop() / num);
                }
                operation = current;
                num = 0;
            }
        }
        int total = 0;
        if(!stack.isEmpty()){
            total += stack.pop();
        }
        return total;
    }
}

/*
Input: s = "3+2*2"
Output: 7

Input: s = " 3/2 "
Output: 1
 */