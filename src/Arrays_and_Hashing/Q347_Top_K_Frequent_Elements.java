package Arrays_and_Hashing;

import java.util.*;

public class Q347_Top_K_Frequent_Elements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k){
        Arrays.sort(nums);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0) + 1);
        }
        //lambda expression,
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(hashMap::get));
        //iterate through the keys in the hashmap
        for(int num : hashMap.keySet()){
            priorityQueue.offer(num);
            if(priorityQueue.size() > k){
                //.poll() will retrieve and remove the most k head from the queue
                //to extract the k most frequent numbers from the priorityqueue in descending order
                priorityQueue.poll();
            }
        }
        //build the result array from the priorityqueue
        int[] output = new int[k];
        for(int i = k - 1; i >= 0; i--){
            output[i] = priorityQueue.poll();
        }
        return output;
    }
}
