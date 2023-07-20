package Stack;

import java.util.ArrayList;
import java.util.List;

public class Q22_Generate_Parentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n){
        List<String> list = new ArrayList<>();
        backTrack(n, 0,0,list, "");
        return list;
    }
    public static void backTrack(int n, int startIndex, int endIndex, List<String> list, String sublist){
        if(sublist.length() == n * 2){
            list.add(sublist);
            return;
        }
        if(startIndex < n){
            backTrack(n,startIndex + 1,endIndex,list,sublist + "(");
        }
        if(endIndex < startIndex){
            backTrack(n,startIndex,endIndex + 1, list, sublist + ")");
        }
    }
}
