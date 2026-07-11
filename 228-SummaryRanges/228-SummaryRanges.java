// Last updated: 7/11/2026, 2:05:11 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        java.util.List<String> res = new java.util.ArrayList<>();
        if (nums.length == 0) return res;
        
        int start = nums[0];
        
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    res.add(String.valueOf(start));
                } else {
                    res.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) start = nums[i];
            }
        }
        
        return res;
    }
}