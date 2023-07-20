package Stack_and_Recursion;

import java.util.Stack;

public class Q682_Baseball_Game {
    public static void main(String[] args) {

    }
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                stack.pop();
            }else if(operations[i].equals("D")){
                stack.push(stack.peek() * 2);
            }else if(operations[i].equals("+")){
                int int1 = stack.pop();
                int int2 = stack.pop();
                int addOnValue = int1 + int2;
                stack.push(int2);
                stack.push(int1);
                stack.push(addOnValue);
            }else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
