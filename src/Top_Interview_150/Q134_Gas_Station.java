package Top_Interview_150;

public class Q134_Gas_Station {
    public static void main(String[] args) {

    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int remainingGas = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalCost > totalGas){
            return -1;
        }
        for(int i = 0; i < gas.length; i++){
            remainingGas = remainingGas + gas[i] - cost[i];
            if(remainingGas < 0){
                start++;
                remainingGas = 0;
            }
        }
        return start;
    }
}
