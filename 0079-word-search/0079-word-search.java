class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, String word, int ind) {
        int r = board.length;
        int c = board[0].length;

        if (ind == word.length()) return true; // All chars matched
        if (i < 0 || i >= r || j < 0 || j >= c || board[i][j] != word.charAt(ind)) {
            return false;
        }

        char temp = board[i][j];  // Save the original char
        board[i][j] = '#';        // Mark as visited

        // Explore in all four directions
        boolean found = dfs(board, i + 1, j, word, ind + 1) ||
                        dfs(board, i - 1, j, word, ind + 1) ||
                        dfs(board, i, j + 1, word, ind + 1) ||
                        dfs(board, i, j - 1, word, ind + 1);

        board[i][j] = temp;  // Backtrack

        return found;
    }

}