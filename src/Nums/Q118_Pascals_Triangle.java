package Nums;

import java.util.ArrayList;
import java.util.List;

public class Q118_Pascals_Triangle {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        if(numRows == 0){
            return output;
        }

        //add the first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        output.add(firstRow);

        //for other rows
        List<Integer> previousRow = new ArrayList<>();
        previousRow = firstRow;
        for(int i = 1; i < numRows; i++){
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j = 1; j < i; j++){
                currRow.add(previousRow.get(j) + previousRow.get(j - 1));
            }
            currRow.add(1);
            output.add(currRow);
            previousRow = currRow;
        }
        return output;
    }
}
