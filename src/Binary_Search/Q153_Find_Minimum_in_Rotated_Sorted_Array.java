package Binary_Search;

public class Q153_Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

    }
    public static int findMin(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[left] < nums[right]){
                return nums[left];
            }else if(nums[mid] >= nums[left]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return 0;
    }
}
