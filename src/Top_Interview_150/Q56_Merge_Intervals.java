package Top_Interview_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56_Merge_Intervals {
    public static void main(String[] args) {

    }
    public int[][] merge(int[][] intervals) {
        // 创建一个列表来存储合并后的区间
        List<int[]> output = new ArrayList<>();

        // 根据每个区间的开始对区间进行排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 使用第一个区间初始化开始和结束值
        int start = intervals[0][0];
        int end = intervals[0][1];

        // 遍历区间以合并重叠的部分
        for (int[] interval : intervals) {
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                output.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }

        // 添加最后一个区间
        output.add(new int[]{start, end});

        // 将区间列表转换为2D数组并返回
        return output.toArray(new int[output.size()][2]);
    }

}
