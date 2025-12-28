class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0 && grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length; int columns = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1) {
                    int currentArea = calculateArea(grid, i, j);
                    if (currentArea > maxArea) {
                        maxArea = currentArea;
                    }
                }
            }
        }
        return maxArea;
    }
    private int calculateArea(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        return 1 + calculateArea(grid, i + 1, j) +
        calculateArea(grid, i - 1, j) +
        calculateArea(grid, i, j + 1) +
        calculateArea(grid, i, j - 1);
    }
}