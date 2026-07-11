// Last updated: 7/11/2026, 2:06:01 PM
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int n=Math.abs(maxDepth(root.right)-maxDepth(root.left));
        if(n>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);      
    }
    public int maxDepth(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
