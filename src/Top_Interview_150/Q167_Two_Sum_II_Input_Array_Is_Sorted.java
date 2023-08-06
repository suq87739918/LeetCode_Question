package Top_Interview_150;

import java.util.ArrayList;
import java.util.List;

public class Q167_Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        // This line should never be reached because the problem states there is exactly one solution.
        throw new IllegalArgumentException("No solution found");
    }
}
