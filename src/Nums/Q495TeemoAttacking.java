package Nums;

public class Q495TeemoAttacking {
    public static void main(String[] args) {

    }
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int output = 0;
        for(int i = 0; i < timeSeries.length - 1; i++) {
            output += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        output += duration;
        return output;
    }
}
