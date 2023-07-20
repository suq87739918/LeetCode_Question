package Two_Pointers;

import java.util.ArrayList;
import java.util.List;

public class Q167_Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[] {left + 1, right + 1};
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }else if(numbers[left] + numbers[right] > target){
                right--;
            }
        }
        return new int[0];
    }
}
