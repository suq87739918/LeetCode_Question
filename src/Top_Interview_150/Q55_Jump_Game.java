package Top_Interview_150;

public class Q55_Jump_Game {
    public static void main(String[] args) {

    }
    public boolean canJump(int[] nums) {
        int end = 0;
        for(int i = 0; i <= end; i++){
            end = Math.max(end, nums[i] + i);
            if(end >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}
