import java.util.Stack;

public class Q150_Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        String[] s1 = {"2", "1", "+", "3", "*"};
        String[] s2 = {"4","13","5","/","+"};
        String[] s3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(s1));
        System.out.println(evalRPN(s2));
        System.out.println(evalRPN(s3));
    }
    public static int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                stack.add(stack.pop() + stack.pop());
            }else if(token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b - a);
            } else if (token.equals("*")) {
                int c = stack.pop();
                int d = stack.pop();
                stack.add(c * d);
            } else if (token.equals("/")) {
                int e = stack.pop();
                int f = stack.pop();
                stack.add(f/e);
            }else{
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
