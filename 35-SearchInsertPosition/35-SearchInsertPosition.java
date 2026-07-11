// Last updated: 7/11/2026, 2:07:13 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
      return nums.length; 
    }
}