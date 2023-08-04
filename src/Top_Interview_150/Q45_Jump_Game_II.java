package Top_Interview_150;

public class Q45_Jump_Game_II {
    public static void main(String[] args) {

    }
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;

        int maxReach = nums[0];
        int steps = nums[0];
        int jumps = 1;

        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return jumps;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            steps--;

            if (steps == 0) {
                jumps++;
                steps = maxReach - i;
            }
        }

        return jumps;
    }

}
