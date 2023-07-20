package Stack_and_Recursion;

import java.util.Stack;

public class Q150_Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {

    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int x = stack.pop();
                int y = stack.pop();
                int z = x + y;
                stack.push(z);
            }else if(s.equals("*")){
                int x = stack.pop();
                int y = stack.pop();
                int z = x * y;
                stack.push(z);
            }else if(s.equals("/")){
                int x = stack.pop();
                int y = stack.pop();
                int z = y / x;
                stack.push(z);
            }else if(s.equals("-")){
                int x = stack.pop();
                int y = stack.pop();
                int z = y - x;
                stack.push(z);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}


/*
Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
 */
