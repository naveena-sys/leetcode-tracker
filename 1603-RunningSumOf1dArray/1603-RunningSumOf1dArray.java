// Last updated: 7/11/2026, 2:03:08 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)  nums[i]+=nums[i-1];
        return nums;
    }
}