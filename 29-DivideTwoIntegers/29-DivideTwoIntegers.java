// Last updated: 7/11/2026, 2:07:19 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }
}