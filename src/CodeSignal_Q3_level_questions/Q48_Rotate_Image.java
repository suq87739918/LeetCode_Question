package CodeSignal_Q3_level_questions;

public class Q48_Rotate_Image {
    public static void main(String[] args) {

    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int j = 0; j < n / 2; j++){
            for(int i = j; i < n - j - 1; i++){
                int top_left_temp = matrix[i][j];
                //set top left to bottom left
                matrix[i][j] = matrix[n - 1 - j][i];
                //set bottom left to bottom right
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                //set bottom right to top right
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - i - 1];
                //use temp variable to set top right to top left
                matrix[j][n - i - 1] = top_left_temp;
            }
        }
    }
}
