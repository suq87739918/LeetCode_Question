package Nums;

public class Q566_Reshape_the_Matrix {
    public static void main(String[] args) {

    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int column = mat[0].length;

        //corner case
        if(row * column != r * c){
            return mat;
        }

        int[][] output = new int[r][c];
        int rowStart = 0;
        int columnStart = 0;

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
