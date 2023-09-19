package CodeSignal_Q3_level_questions;

import java.util.ArrayList;
import java.util.List;

public class Q498_Diagonal_Traverse {
    public static void main(String[] args) {

    }
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int column = mat[0].length;
        int[] result = new int[row * column];
        boolean isUp = true;  // 控制对角线遍历方向
        int i = 0, j = 0;

        for(int k = 0; k < row * column; k++){
            result[k] = mat[i][j];
            if(isUp == true){  //左下向又上的遍历
                if(j == column - 1){
                    i++;
                    isUp = !isUp;
                }else if(i == 0){
                    j++;
                    isUp = !isUp;
                }else{
                    i--;
                    j++;
                }
            }else{ //从右上向左下的遍历
                if(i == row - 1){
                    j++;
                    isUp = !isUp;
                }else if(j == 0){
                    i++;
                    isUp = !isUp;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
