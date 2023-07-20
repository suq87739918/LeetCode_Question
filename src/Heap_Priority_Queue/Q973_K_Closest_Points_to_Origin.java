package Heap_Priority_Queue;

import java.util.PriorityQueue;

public class Q973_K_Closest_Points_to_Origin {
    public static void main(String[] args) {

    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < points.length; i++){
            int lengthToOrigin = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            priorityQueue.add(new int[] {i,lengthToOrigin});
        }
        int[][] output = new int[k][];
        while(k > 0){
            output[k - 1] = points[priorityQueue.poll()[0]];
            k--;
        }
        return output;
    }
    //这段 Java 代码是一个找出距离原点最近的 K 个点的算法实现。让我们逐行解释代码的含义：
    //
    //PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
    //这行代码创建了一个优先级队列（Priority Queue），用于存储点及其对应的距离平方。这个优先级队列会根据点的距离平方（即第二个元素，a[1] 和 b[1]）从小到大进行排序。
    //
    //for(int i = 0; i < points.length; i++) {
    //这是一个循环语句，用于遍历给定的点集合 points。
    //
    //int sum = points[i][0] * points[i][0] + points[i][1] * points[i][1];
    //这行代码计算当前点到原点的距离的平方。使用了欧氏距离的平方计算公式：平方和等于 x 坐标的平方加上 y 坐标的平方。
    //
    //pq.add(new int[] {i,sum});
    //这行代码创建了一个包含两个元素的整数数组，第一个元素是点的索引 i，第二个元素是该点到原点的距离的平方 sum。然后将这个数组添加到优先级队列 pq 中。
    //
    //int[][] res = new int[k][];
    //这行代码创建了一个二维整数数组 res，用于存储结果。它有 k 行，表示要找出的 K 个最近的点。
    //
    //while(k > 0) {
    //这是一个循环语句，用于取出优先级队列中的前 k 个最小距离的点。
    //
    //res[k-1] = points[pq.poll()[0]];
    //这行代码从优先级队列 pq 中取出一个元素，该元素是一个数组，其中第一个元素是点的索引，通过索引可以获取到原始的点的坐标，将其赋值给结果数组 res 中的第 k-1 行。
    //
    //k--;
    //将 k 的值减 1，继续下一次循环。
    //
    //return res;
    //返回结果数组 res，其中包含了距离原点最近的 K 个点的坐标。
    //假设输入的 points 数组是 [[1, 3], [2, 2], [1, 1], [3, 2]]，而 k 的值为 3。
    //
    //初始时，优先级队列 pq 是空的，结果数组 res 也是空的。
    //
    //接下来，代码会遍历 points 数组中的每个点，并计算其到原点的距离的平方。这会生成以下的优先级队列 pq：
    //pq: [[2, 2], [1, 5], [3, 13], [0, 10]]
    //在这个例子中，pq 的元素是以距离平方的大小进行排序的。第一个元素 [2, 2] 的距离平方最小，原点到点 [2, 2] 的距离平方为 2，所以它排在队列的前面。
    //然后，代码会创建一个大小为 k 的结果数组 res。在这个例子中，res 的初始状态如下：
    //res: [null, null, null]
    //接下来，代码会进入一个循环，循环条件是 k > 0。在每次循环迭代中，它会从优先级队列 pq 中取出一个元素，并将其存储到结果数组 res 中。
    //在第一次循环迭代中，执行以下操作：
    //pq.poll()：从优先级队列中取出距离最小的元素 [2, 2]。
    //pq.poll()[0]：取出元素 [2, 2] 的第一个值，即点的索引 2。
    //points[pq.poll()[0]]：获取索引为 2 的点的坐标 [1, 1]。
    //然后，将点 [1, 1] 存储到结果数组 res 的第 k-1 行，即第 2 行。所以此时，res 的状态为：
    //res: [null, [1, 1], null]
    //继续循环迭代，重复上述操作，直到 k 的值减为 0。
    //最终，完成循环迭代后，结果数组 res 存储了距离原点最近的 k 个点的坐标。在这个例子中，最终的 res 数组如下：
    //res: [[3, 2], [1, 1], [2, 2]]
}
