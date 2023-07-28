package Two_Pointers;

public class Q80_Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums){

        int count = 2;
        for(int i = count; i < nums.length; i++){
            if(nums[i] != nums[count - 2]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
