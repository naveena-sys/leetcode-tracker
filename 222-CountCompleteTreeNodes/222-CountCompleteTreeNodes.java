// Last updated: 7/11/2026, 2:05:13 PM
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
























