package CodeSignal_Q3_level_questions;

public class Q766_Toeplitz_Matrix {
    public static void main(String[] args) {

    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i = 1; i < row; i++){
            for(int j = 1; j < column; j++){
                if(matrix[i][j] != matrix[i - 1][j - 1]){
                    return false;
                }
            }
        }
        return true;
    }
}
