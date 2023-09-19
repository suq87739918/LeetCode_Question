package CodeSignal_Q3_level_questions;

public class Q59_Spiral_Matrix_II {
    public static void main(String[] args) {

    }
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int currVal = 1;
        int[][] matrix = new int[n][n];

        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                matrix[top][i] = currVal++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = currVal++;
            }
            right--;
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = currVal++;
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = currVal++;
            }
            left++;
        }
        return matrix;
    }
}
