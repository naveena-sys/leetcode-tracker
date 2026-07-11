// Last updated: 7/11/2026, 2:04:40 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int size = 0;
        
        for (int n : nums) {
            int l = 0, r = size;
            while (l < r) {
                int m = (l + r) / 2;
                if (dp[m] < n) l = m + 1;
                else r = m;
            }
            dp[l] = n;
            if (l == size) size++;
        }
        
        return size;
    }
}