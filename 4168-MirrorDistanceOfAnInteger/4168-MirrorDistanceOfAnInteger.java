// Last updated: 7/11/2026, 2:01:17 PM
class Solution {
    private int rev(int n) {
        int a = 0;
        while(n > 0) {
            a = a * 10 + (n % 10);
            n /= 10;
        }
        return a;
    }
    public int mirrorDistance(int n) {
        int m = rev(n);
        return Math. abs(m - n);
    }
}