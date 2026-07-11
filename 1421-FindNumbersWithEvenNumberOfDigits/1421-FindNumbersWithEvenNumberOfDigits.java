// Last updated: 7/11/2026, 2:03:11 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int digits = 0;
            if (temp == 0) {
                digits = 1;
            }
            while (temp != 0) {
                temp /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
