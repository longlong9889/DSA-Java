class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 && grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length; int columns = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    markIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void markIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        markIsland(grid, i + 1, j);
        markIsland(grid, i - 1, j);
        markIsland(grid, i, j + 1);
        markIsland(grid, i, j - 1);
    }
}