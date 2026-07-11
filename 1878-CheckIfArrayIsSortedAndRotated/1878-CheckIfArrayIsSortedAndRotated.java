// Last updated: 7/11/2026, 2:02:58 PM
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int drops = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i + 1) % n]) {
                drops++;
            }
        }
        return drops <= 1;
    }
}