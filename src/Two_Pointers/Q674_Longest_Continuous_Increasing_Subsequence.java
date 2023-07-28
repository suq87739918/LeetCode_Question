package Two_Pointers;

public class Q674_Longest_Continuous_Increasing_Subsequence {
    public static void main(String[] args) {

    }
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int curLength = 1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] > nums[i]){
                curLength++;
            }else{
                curLength = 1;
            }
            maxLength = Math.max(maxLength, curLength);
        }
        System.gc();
        //JVM garbage collector, will increase the runtime, but decrease the memory usage. not suggested!
        return maxLength;
    }
}
