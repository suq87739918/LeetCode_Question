package Nums;

import java.util.ArrayList;
import java.util.List;

public class Q54_Spiral_Matrix {
    public static void main(String[] args) {
        // Test Case 1
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix1)); // Expected output: [1, 2, 3, 6, 9, 8, 7, 4, 5]

        // Test Case 2
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(spiralOrder(matrix2)); // Expected output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

        // Test Case 3
        int[][] matrix3 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        System.out.println(spiralOrder(matrix3)); // Expected output: [1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8, 9]
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int row = matrix.length;
        int column = matrix[0].length;
        int leftBoundary = 0;
        int rightBoundary = column - 1;
        int topBoundary = 0;
        int bottomBoundary = row - 1;
        while(output.size() < row * column){
            for(int i = leftBoundary; i <= rightBoundary && output.size() < row * column; i++){
                output.add(matrix[topBoundary][i]);
            }
            topBoundary++;
            for(int i = topBoundary; i <= bottomBoundary && output.size() < row * column; i++){
                output.add(matrix[i][rightBoundary]);
            }
            rightBoundary--;
            for(int i = rightBoundary; i >= leftBoundary && output.size() < row * column; i--){
                output.add(matrix[bottomBoundary][i]);
            }
            bottomBoundary--;
            for(int i = bottomBoundary; i >= topBoundary && output.size() < row * column; i--){
                output.add(matrix[i][leftBoundary]);
            }
            leftBoundary++;
        }
        return output;
    }
}
