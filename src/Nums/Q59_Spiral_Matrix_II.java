package Nums;

import java.util.ArrayList;
import java.util.List;

public class Q59_Spiral_Matrix_II {
    public static void main(String[] args) {
        System.out.println(generateMatrix(3));
    }
    public static int[][] generateMatrix(int n){
        int leftBoundary = 0;
        int topBoundary = 0;
        int rightBoundary = n - 1;
        int bottomBoundary = n - 1;
        int currVal = 1;
        int[][] matrix = new int[n][n];
        while(leftBoundary <= rightBoundary && topBoundary <= bottomBoundary){
            for(int i = leftBoundary; i <= rightBoundary; i++){
                matrix[topBoundary][i] = currVal++;
            }
            topBoundary++;
            for(int i = topBoundary; i <= bottomBoundary; i++){
                matrix[i][rightBoundary] = currVal++;
            }
            rightBoundary--;
            for(int i = rightBoundary; i >= leftBoundary; i--){
                matrix[bottomBoundary][i] = currVal++;
            }
            bottomBoundary--;
            for(int i = bottomBoundary; i >= topBoundary; i--){
                matrix[i][leftBoundary] = currVal++;
            }
            leftBoundary++;
        }
        return matrix;
    }
}
