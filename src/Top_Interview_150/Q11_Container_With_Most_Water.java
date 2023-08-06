package Top_Interview_150;

public class Q11_Container_With_Most_Water {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int volume;
        int output = Integer.MIN_VALUE;

        while(left <= right){
            volume = (right - left) * Math.min(height[left], height[right]);
            output = Math.max(output,volume);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return output;
    }
}
