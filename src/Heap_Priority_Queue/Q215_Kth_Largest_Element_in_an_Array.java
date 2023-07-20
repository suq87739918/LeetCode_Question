package Heap_Priority_Queue;

import java.util.PriorityQueue;

public class Q215_Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {

    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            priorityQueue.add(nums[i]);
            if (priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
