package CodeSignal_Q3_level_questions;

public class Q867_Transpose_Matrix {
    public static void main(String[] args) {

    }
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        int rowAfterTranspose = column;
        int columnAfterTranspose = row;

        int[][] output = new int[rowAfterTranspose][columnAfterTranspose];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                output[j][i] = matrix[i][j];
            }
        }
        return output;
    }
}
