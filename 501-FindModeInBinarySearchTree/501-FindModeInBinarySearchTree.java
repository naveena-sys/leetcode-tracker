// Last updated: 7/11/2026, 2:04:11 PM
class Solution {
    Integer prev = null;
    int count = 0;
    int max = 0;
    List<Integer> modes = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null) {
            if (node.val == prev) {
                count++;
            } else {
                count = 1;
            }
        } else {
            count = 1;
        }
        if (count > max) {
            max = count;
            modes.clear();
            modes.add(node.val);
        } else if (count == max) {
            modes.add(node.val);
        }
        prev = node.val;
        inorder(node.right);
    }
}
