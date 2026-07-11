// Last updated: 7/11/2026, 2:07:02 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        backtrack(nums, new boolean[nums.length], new java.util.ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == nums.length) {
            res.add(new java.util.ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            temp.add(nums[i]);
            backtrack(nums, used, temp, res);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}