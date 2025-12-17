class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int left = 0; int right = matrix[0].length - 1;
        int top = 0; int bottom = matrix.length - 1;
        while (left <= right) {
            for (int i = left; i <= right; i++) {                  //left:0        right:2
                spiral.add(matrix[top][i]);                        //top:1         bottom:2
            }                                                      //spiral: 1,2,3,
            top++;
            if (top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;
            if (left > right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                spiral.add(matrix[bottom][i]);
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                spiral.add(matrix[i][left]);
            }
            left++;
        }
        return spiral;
    }
}