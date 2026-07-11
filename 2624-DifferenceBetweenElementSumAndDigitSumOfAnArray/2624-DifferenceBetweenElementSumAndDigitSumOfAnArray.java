// Last updated: 7/11/2026, 2:02:20 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int digit = 0;
        for(int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            int num = nums[i];
            while(num > 0) {
                digit += num % 10;
                num /= 10;
            }
        }
        return Math.abs(sum1 - digit);
    }
}