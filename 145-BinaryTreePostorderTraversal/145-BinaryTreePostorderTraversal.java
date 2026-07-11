// Last updated: 7/11/2026, 2:05:45 PM
class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return list;
    }
    private void traversal(TreeNode root) {
        if (root==null) return;
        traversal(root.left);
        traversal(root.right);
        list.add(root.val);
    }
}
