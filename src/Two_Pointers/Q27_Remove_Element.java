package Two_Pointers;

public class Q27_Remove_Element {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int size = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
    }
}
