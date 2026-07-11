// Last updated: 7/11/2026, 2:04:10 PM
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;

        if(isEqual(root,subRoot)) return true;
        return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));
    }

    private boolean isEqual(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;

        return isEqual(p.left,q.left) && isEqual(p.right,q.right);
    }
}