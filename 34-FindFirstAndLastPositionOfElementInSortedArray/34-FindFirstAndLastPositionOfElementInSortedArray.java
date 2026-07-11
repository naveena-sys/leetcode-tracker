// Last updated: 7/11/2026, 2:07:14 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }

    private int first(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) {
                if (nums[m] == target) ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    private int last(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] <= target) {
                if (nums[m] == target) ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}