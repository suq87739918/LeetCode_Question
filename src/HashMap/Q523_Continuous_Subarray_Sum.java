package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q523_Continuous_Subarray_Sum {
    public static void main(String[] args) {

    }
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // 存储余数出现的最早位置
        map.put(0, -1); // 初始条件，余数为0，位置为-1
        int sum = 0; // 前缀和

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // 计算前缀和
            if (k != 0) { // 防止k为0的情况
                sum = sum % k; // 取余数
            }
            if (map.containsKey(sum)) {
                // 如果map中已经有相同余数存在，且位置差距大于等于2，那么就找到了符合要求的子数组
                if (i - map.get(sum) > 1)
                    return true;
            } else {
                // 如果map中还没有这个余数，那么就把这个余数和当前位置放入map中
                map.put(sum, i);
            }
        }

        // 如果遍历完都没有找到符合要求的子数组，那么就返回false
        return false;
    }
}
