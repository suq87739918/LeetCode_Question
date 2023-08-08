package Top_Interview_150;

import java.util.HashSet;

public class Q36_Valid_Sudoku {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // Check row
                if (board[i][j] != '.' && !rows.add(board[i][j])) {
                    return false;
                }

                // Check column
                if (board[j][i] != '.' && !columns.add(board[j][i])) {
                    return false;
                }

                // Check 3x3 box
                int rowIndex = 3 * (i / 3), colIndex = 3 * (i % 3);
                if (board[rowIndex + j / 3][colIndex + j % 3] != '.' &&
                        !cube.add(board[rowIndex + j / 3][colIndex + j % 3])) {
                    return false;
                }
            }
        }
        return true;
    }
}
