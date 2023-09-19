package CodeSignal_Q3_level_questions;

import java.util.ArrayList;
import java.util.List;

public class Q566_Reshape_the_Matrix {
    public static void main(String[] args) {

    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int column = mat[0].length;
        int[][] output = new int[r][c];
        int rowStart = 0;
        int columnStart = 0;
        if(row * column != r * c){
            return mat;
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                output[rowStart][columnStart] = mat[i][j];
                columnStart++;
                if(columnStart == c){
                    columnStart = 0;
                    rowStart++;
                }
            }
        }
        return output;
    }
}
