//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.PriorityQueue;
//
//public class Q2 {
//    public static void main(String[] args) {
//        System.out.println(twoSum(new int[]{2,7,11,15}, 9));
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//
//    import java.util.PriorityQueue;
//
//    public class PriorityQueueExample {
//        public static void main(String[] args) {
//            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//            pq.add(10);
//            pq.add(20);
//            pq.add(5);
//            System.out.println(pq); // Output: [5, 20, 10]
//            System.out.println(pq.poll()); // Output: 5
//            System.out.println(pq); // Output: [10, 20]
//        }
//    }
//
//    import java.util.*;
//
//    class CharFrequency implements Comparable<CharFrequency> {
//        char c;
//        int frequency;
//
//        public CharFrequency(char c, int frequency) {
//            this.c = c;
//            this.frequency = frequency;
//        }
//
//        @Override
//        public int compareTo(CharFrequency other) {
//            return other.frequency - this.frequency; // reverse order
//        }
//    }
//
//    public class PriorityQueueExample {
//        public static void main(String[] args) {
//            String str = "hello world";
//            Map<Character, Integer> map = new HashMap<>();
//
//            // calculate frequency of each character
//            for (char c : str.toCharArray()) {
//                map.put(c, map.getOrDefault(c, 0) + 1);
//            }
//
//            // create priority queue and add char frequencies
//            PriorityQueue<CharFrequency> pq = new PriorityQueue<>();
//            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//                pq.add(new CharFrequency(entry.getKey(), entry.getValue()));
//            }
//
//            // create new string with char frequencies
//            StringBuilder sb = new StringBuilder();
//            while (!pq.isEmpty()) {
//                CharFrequency cf = pq.poll();
//                for (int i = 0; i < cf.frequency; i++) {
//                    sb.append(cf.c);
//                }
//            }
//
//            System.out.println(sb.toString()); // output: "lllooeh wrd"
//        }
//    }
//}
