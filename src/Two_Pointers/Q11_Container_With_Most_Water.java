package Two_Pointers;

import java.util.Enumeration;

public class Q11_Container_With_Most_Water {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int curValue = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int output = (right - left) * (Math.min(height[right], height[left]));
            curValue = Math.max(output, curValue);
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return curValue;
    }
}
