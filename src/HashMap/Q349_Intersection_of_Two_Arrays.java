package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Q349_Intersection_of_Two_Arrays {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            if(!seen.contains(nums1[i])){
                seen.add(nums1[i]);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(seen.contains(nums2[i])){
                inter.add(nums2[i]);
            }
        }

        int outputSize = inter.size();
        int arr[] = new int[outputSize];

        int i = 0;
        for(int num : inter){
            arr[i++] = num;
        }
        return arr;
    }
}
