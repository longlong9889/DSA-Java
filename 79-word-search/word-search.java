class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, board, word, 0) == true) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int i, int j, char[][] board, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i == board.length || j == board[0].length || i < 0 || j < 0) {
            return false;
        }
        if (board[i][j] != word.charAt(index) || board[i][j] == '#') {
            return false;
        }
        char saved = board[i][j];
        board[i][j] = '#';
        boolean found = dfs(i, j + 1, board, word, index + 1)
        || dfs(i + 1, j, board, word, index + 1)
        || dfs(i - 1, j, board, word, index + 1)
        || dfs(i, j - 1, board, word, index + 1);
        board[i][j] = saved;
        return found;
    }
}