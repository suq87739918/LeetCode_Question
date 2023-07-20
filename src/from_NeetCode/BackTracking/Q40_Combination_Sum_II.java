import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40_Combination_Sum_II {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        backTrack(candidates, target, output, subList, 0);
        return output;
    }
    private static void backTrack(int[] candidates, int remaining, List<List<Integer>> output, List<Integer> subList, int start){
        if(remaining < 0){
            return;
        }else if(remaining == 0){
            output.add(new ArrayList<>(subList));
        }else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i - 1]){
                    continue;
                }
                subList.add(candidates[i]);
                backTrack(candidates, remaining - candidates[i], output, subList, i + 1);
                subList.remove(subList.size() - 1);
            }
        }
    }
}
