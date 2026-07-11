// Last updated: 7/11/2026, 2:07:25 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}