// Last updated: 7/11/2026, 2:04:46 PM
class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum=0;
        int actualSum=0;     
        for (int i=0; i<=nums.length; i++) { 
            expectedSum += i;
        }    
        for (int num:nums) { 
            actualSum+=num;
        } 
        return expectedSum-actualSum;
    }
}
