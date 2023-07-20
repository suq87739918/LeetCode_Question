package Binary_Search;

public class Q74_Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(searchMatrix(matrix1, 3));
        System.out.println(searchMatrix(matrix1, 33));
    }
    public static boolean searchMatrix(int[][] matrix, int target){
        int row = matrix.length;
        int column = matrix[0].length;
        int low = 0;
        int high = (row * column) - 1;
        if(matrix.length == 0){
            return false;
        }
        while(low <= high){
            int midpoint = (high + low) / 2;
            int value = matrix[midpoint/column][midpoint%column];
            if(value == target){
                return true;
            }else if(value > target){
                high = midpoint - 1;
            }else{
                low = midpoint + 1;
            }
        }
        return false;
    }
}
