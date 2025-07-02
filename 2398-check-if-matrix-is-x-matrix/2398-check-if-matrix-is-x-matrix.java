class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            if (grid[i].length != n) return false; // ensure square matrix

            for (int j = 0; j < n; j++) {
                boolean isPrimary = (i == j);
                boolean isSecondary = (i + j == n - 1);

                if (isPrimary || isSecondary) {
                    if (grid[i][j] == 0) return false; // diagonals must be non-zero
                } else {
                    if (grid[i][j] != 0) return false; // non-diagonals must be zero
                }
            }
        }

        return true;
    }
}