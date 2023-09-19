package CodeSignal_Q3_level_questions;

import java.util.ArrayList;
import java.util.List;

public class Q54_Spiral_Matrix {
    public static void main(String[] args) {
        // Test Case 1: 3x3 matrix
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> result1 = spiralOrder(matrix1);
        System.out.println("Test Case 1: " + result1);  // Output should be [1, 2, 3, 6, 9, 8, 7, 4, 5]

        // Test Case 2: 2x2 matrix
        int[][] matrix2 = {
                {1, 2},
                {4, 3}
        };
        List<Integer> result2 = spiralOrder(matrix2);
        System.out.println("Test Case 2: " + result2);  // Output should be [1, 2, 3, 4]

        // Test Case 3: 3x2 matrix
        int[][] matrix3 = {
                {1, 2},
                {4, 3},
                {5, 6}
        };
        List<Integer> result3 = spiralOrder(matrix3);
        System.out.println("Test Case 3: " + result3);  // Output should be [1, 2, 3, 6, 5, 4]
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        List<Integer> output = new ArrayList<>();

        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;

        while(row * column > output.size()){
            for(int i = left; i <= right && output.size() < row * column; i++){
                output.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom && output.size() < row * column; i++){
                output.add(matrix[i][right]);
            }
            right--;
            for(int i = right; i >= left && output.size() < row * column; i--){
                output.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom; i >= top && output.size() < row * column; i--){
                output.add(matrix[i][left]);
            }
            left++;
        }
        return output;
    }
}
