// Last updated: 7/11/2026, 2:01:28 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=nums[0],min=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        return (long)k*(max-min);
    }
}