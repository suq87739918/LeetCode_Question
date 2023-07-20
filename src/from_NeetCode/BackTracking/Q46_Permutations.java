import java.util.ArrayList;
import java.util.List;

public class Q46_Permutations {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        backTrack(nums, output, subList);
        return output;
    }
    private static void backTrack(int[] nums, List<List<Integer>> output, List<Integer> subList){
        if(subList.size() == nums.length){
            output.add(new ArrayList<>(subList));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(subList.contains(nums[i])){
                    continue;
                }
                subList.add(nums[i]);
                backTrack(nums, output, subList);
                subList.remove(subList.size() - 1);
            }
        }
    }
}
