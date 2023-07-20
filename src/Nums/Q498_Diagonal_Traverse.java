package Nums;

import java.util.ArrayList;
import java.util.List;

public class Q498_Diagonal_Traverse {
    public static void main(String[] args) {

    }
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLength = mat.length;
        int columnLength = mat[0].length;
        int rowStart = 0;
        int columnStart = 0;
        int[] output = new int[rowLength * columnLength];
        int i = 0;
        boolean isUp = true;

        while(rowStart < rowLength && columnStart < columnLength){
            if(isUp){
                while(columnStart < columnLength - 1 && rowStart > 0){
                    output[i++] = mat[rowStart][columnStart];
                    rowStart--;
                    columnStart++;
                }
                output[i++] = mat[rowStart][columnStart];
                if(columnStart == columnLength - 1){
                    rowStart++;
                }else{
                    columnStart++;
                }
            }else{
                while(columnStart > 0 && rowStart < rowLength - 1){
                    output[i++] = mat[rowStart][columnStart];
                    rowStart++;
                    columnStart--;
                }
                output[i++] = mat[rowStart][columnStart];
                if(rowStart == rowLength - 1){
                    columnStart++;
                }else{
                    rowStart++;
                }
            }
            isUp = !isUp;
        }
        return output;
    }
}
