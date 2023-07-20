package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q39_Combination_Sum {
    public static void main(String[] args) {
        int[] candidates = {8, 7, 4, 3};
        int target = 11;
        //int[] candidates = {2, 3, 6, 7};
        //int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
    static List<List<Integer>> output = new ArrayList<>();
    static List<Integer> subList = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates, target, 0);
        return output;
    }
    private static void backTrack(int[] candidates, int target, int index){
        if(target == 0){
            output.add(new ArrayList<>(subList));
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(candidates[i] > target){
                break;
            }
            subList.add(candidates[i]);
            backTrack(candidates, target - candidates[i], i);
            subList.remove(subList.size() - 1);
        }
    }
}

