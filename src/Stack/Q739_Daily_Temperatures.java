package Stack;

import java.util.Stack;

public class Q739_Daily_Temperatures {
    public static void main(String[] args) {

    }
    public static int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for(int currDay = 0 ; currDay >= 0; currDay++){
            while(!stack.isEmpty() && temperatures[currDay] > temperatures[stack.peek()]){
                int prevDay = stack.pop();
                res[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }
        return res;
    }
}
