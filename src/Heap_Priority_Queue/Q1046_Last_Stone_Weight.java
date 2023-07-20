package Heap_Priority_Queue;

import java.util.PriorityQueue;

public class Q1046_Last_Stone_Weight {
    public static void main(String[] args) {

    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int stone : stones){
            priorityQueue.add(-stone);
        }
        while(priorityQueue.size() > 1){
            int stone1 = priorityQueue.remove();
            int stone2 = priorityQueue.remove();
            if(stone1 != stone2){
                priorityQueue.add(stone1 - stone2);
            }
        }
        return priorityQueue.size() != 0 ? -priorityQueue.remove() : 0;
    }
}
