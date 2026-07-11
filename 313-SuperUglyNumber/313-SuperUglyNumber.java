// Last updated: 7/11/2026, 2:04:39 PM
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] idx = new int[k];
        long[] ugly = new long[n];
        ugly[0] = 1;
        
        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                next = Math.min(next, primes[j] * ugly[idx[j]]);
            }
            ugly[i] = next;
            for (int j = 0; j < k; j++) {
                if (primes[j] * ugly[idx[j]] == next) idx[j]++;
            }
        }
        
        return (int) ugly[n - 1];
    }
}