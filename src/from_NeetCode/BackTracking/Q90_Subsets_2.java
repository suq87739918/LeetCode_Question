import java.util.ArrayList;
import java.util.List;

public class Q90_Subsets_2 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        backTrack(nums, output, subList, 0);
        return output;
    }
    private static void backTrack(int[] nums, List<List<Integer>> output, List<Integer> subList, int index){
        output.add(new ArrayList<>(subList));
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i - 1]){
                continue;
            }
            subList.add(nums[i]);
            backTrack(nums, output, subList, i + 1);
            subList.remove(subList.size() - 1);
        }
    }
}
