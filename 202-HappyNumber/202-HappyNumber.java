// Last updated: 7/11/2026, 2:05:30 PM
class Solution {
    public int num(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum += dig * dig;
            n = n / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
       while (n != 1 && n != 4) {
            n = num(n);
        }
        return n == 1;
    }
}