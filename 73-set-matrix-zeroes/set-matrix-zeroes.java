class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    q.add(new int[]{i, j});
                }
            }
        }
        while (!q.isEmpty()) {
            int[] zero = q.poll();
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][zero[1]] = 0;
            }
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[zero[0]][i] = 0;
            }
        }
        System.out.print(matrix);
    }
}