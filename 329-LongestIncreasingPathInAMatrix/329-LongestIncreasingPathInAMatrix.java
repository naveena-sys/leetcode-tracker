// Last updated: 7/11/2026, 2:04:34 PM
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dfs(matrix, i, j, dp));
            }
        }
        return max;
    }

    private int dfs(int[][] mat, int i, int j, int[][] dp) {
        if (dp[i][j] != 0) return dp[i][j];
        int val = mat[i][j], max = 1;

        if (i > 0 && mat[i - 1][j] > val) max = Math.max(max, 1 + dfs(mat, i - 1, j, dp));
        if (j > 0 && mat[i][j - 1] > val) max = Math.max(max, 1 + dfs(mat, i, j - 1, dp));
        if (i < mat.length - 1 && mat[i + 1][j] > val) max = Math.max(max, 1 + dfs(mat, i + 1, j, dp));
        if (j < mat[0].length - 1 && mat[i][j + 1] > val) max = Math.max(max, 1 + dfs(mat, i, j + 1, dp));

        return dp[i][j] = max;
    }
}