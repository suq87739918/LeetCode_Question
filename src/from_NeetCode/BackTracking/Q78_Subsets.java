import java.util.ArrayList;
import java.util.List;

public class Q78_Subsets {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        backTrack(output, subList, nums, 0);
        return output;
    }
    private static void backTrack(List<List<Integer>> output, List<Integer> subList, int[] nums, int index){
        output.add(new ArrayList<>(subList));
        for(int i = index; i < nums.length; i++){
            subList.add(i);
            backTrack(output, subList, nums, i + 1);
            subList.remove(subList.size() - 1);
        }
    }
}
