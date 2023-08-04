package Top_Interview_150;

public class Q189_Rotate_Array {
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotatedArray = new int[n];

        for(int i = 0; i < n; i++){
            rotatedArray[(i + k) % n] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = rotatedArray[i];
        }
    }
}
