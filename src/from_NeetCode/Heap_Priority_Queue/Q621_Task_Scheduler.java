import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.AbstractMap;

public class Q621_Task_Scheduler {
    public static void main(String[] args) {

    }
    public static int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> (b - a));
        Queue<AbstractMap.SimpleEntry<Integer, Integer>> q = new LinkedList<>();
        if(n == 0){
            return tasks.length;
        }
        int[] array = new int[26];
        for(Character c : tasks){
            array[c - 'A']++;
        }
        for(int val : array){
            if(val > 0){
                priorityQueue.add(val);
            }
        }
        int time = 0;

        while(!priorityQueue.isEmpty() || !q.isEmpty()){
            time++;
            if(!priorityQueue.isEmpty()){
                int val = priorityQueue.poll();
                val--;
                if(val > 0){
                    q.add(new AbstractMap.SimpleEntry<>(val, time + n));
                }
            }
            if(!q.isEmpty() && q.peek().getValue() == time){
                priorityQueue.add(q.poll().getKey());
            }
        }
        return time;
    }
}
