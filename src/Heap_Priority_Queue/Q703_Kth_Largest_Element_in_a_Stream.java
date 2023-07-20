package Heap_Priority_Queue;

import java.util.PriorityQueue;

public class Q703_Kth_Largest_Element_in_a_Stream {
    public static void main(String[] args) {

    }
    final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    int k;
    public void KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i : nums){
            add(i);
        }
    }

    public int add(int val) {
        if(priorityQueue.size() < k){
            priorityQueue.add(val);
        }else if(val > priorityQueue.peek()){
            priorityQueue.poll();
            priorityQueue.add(val);
        }
        return priorityQueue.peek();
    }
}
