package Nums;

import java.util.Arrays;

public class Q274_H_Index {
    public static void main(String[] args) {

    }
    public int hIndex(int[] citations) {
        Arrays.sort(citations);  // Sort the citations array in ascending order

        int n = citations.length;
        int hIndex = 0;
        // Iterate through the sorted array in reverse order
        for (int i = n - 1; i >= 0; i--) {
            int papersWithAtLeastCitations = n - i;  // Number of papers with at least "citations[i]" citations

            // Check if the number of papers with at least "citations[i]" citations is greater than or equal to the citations value
            if (citations[i] >= papersWithAtLeastCitations) {
                hIndex = papersWithAtLeastCitations;  // Update the h-index
            } else {
                break;  // Exit the loop since the condition is not satisfied anymore
            }
        }

        return hIndex;
    }
}
