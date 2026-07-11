// Last updated: 7/11/2026, 2:02:26 PM
class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> a[0] - b[0]);
        
        int m = robot.size(), n = factory.length;
        long[][] dp = new long[m + 1][n + 1];
        
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE / 2);
        }
        
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }
        
        for (int j = 1; j <= n; j++) {
            int pos = factory[j - 1][0];
            int limit = factory[j - 1][1];
            
            for (int i = 0; i <= m; i++) {
                dp[i][j] = dp[i][j - 1];
                
                long dist = 0;
                for (int k = 1; k <= limit && k <= i; k++) {
                    dist += Math.abs(robot.get(i - k) - pos);
                    dp[i][j] = Math.min(dp[i][j], dp[i - k][j - 1] + dist);
                }
            }
        }
        
        return dp[m][n];
    }
}