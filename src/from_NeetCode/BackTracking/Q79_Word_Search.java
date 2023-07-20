public class Q79_Word_Search {
    public static void main(String[] args) {

    }
    public static boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(char[][] board, String word, int i, int j, int count){
        if(count == word.length()){
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(count)){
            return false;
        }
        //当前位置为board[i][j]，这个位置已经来过了，所以给它设置成'？'，因为？不在题目表述的可出现范围内，所以会报错，避免重复使用
        char temp = board[i][j];
        board[i][j] = '?';
        boolean found = dfs(board, word, i + 1, j, count + 1) ||
                        dfs(board, word, i - 1, j, count + 1) ||
                        dfs(board, word, i, j + 1, count + 1) ||
                        dfs(board, word, i, j - 1, count + 1);
        board[i][j] = temp;
        return found;
    }
}
