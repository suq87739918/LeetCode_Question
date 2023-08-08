package Top_Interview_150;

import java.util.ArrayList;
import java.util.List;

public class Q54_Spiral_Matrix {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }
        int row = matrix.length;
        int column = matrix[0].length;
        List<Integer> output = new ArrayList<>();

        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;

        while(output.size() < row * column){
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
