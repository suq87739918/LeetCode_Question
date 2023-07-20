package Nums;

import java.util.ArrayList;
import java.util.List;

public class Q119_Pascals_Triangle_II {
    public static void main(String[] args) {

    }
    public List<Integer> getRow(int rowIndex) {
        // Set up first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        // Other rows
        List<Integer> previousRow = firstRow;
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(previousRow.get(j) + previousRow.get(j - 1));
            }
            currRow.add(1);
            previousRow = currRow;
        }
        return previousRow;
    }
}
