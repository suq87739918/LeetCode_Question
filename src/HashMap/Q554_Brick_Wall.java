package HashMap;

import java.util.HashMap;
import java.util.List;

public class Q554_Brick_Wall {
    public static void main(String[] args) {

    }
    public int leastBricks(List<List<Integer>> wall) {
        int maxFreq = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(List<Integer> row : wall){
            int sum = 0;
            for(int i = 0; i < row.size() - 1; i++){
                sum += row.get(i);
                hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
                maxFreq = Math.max(maxFreq, hashMap.get(sum));
            }
        }
        return wall.size() - maxFreq;
    }
}
