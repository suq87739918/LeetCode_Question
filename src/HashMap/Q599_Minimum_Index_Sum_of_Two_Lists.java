package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q599_Minimum_Index_Sum_of_Two_Lists {
    public static void main(String[] args) {

    }
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> output = new ArrayList<>();

        int minSum = Integer.MAX_VALUE;
        int currSum;
        for(int i = 0; i < list1.length; i++){
            hashMap.put(list1[i], i);
        }
        for(int j = 0; j < list2.length; j++){
            if(hashMap.containsKey(list2[j])){
                currSum = j + hashMap.get(list2[j]);
                if(currSum < minSum){
                    //if there exist better situation, clean the previous recorded answer
                    output.clear();
                    output.add(list2[j]);
                    minSum = currSum;
                }else if(currSum == minSum){
                    output.add(list2[j]);
                }
            }
        }
        return output.toArray(new String[output.size()]);
    }
}
