// Last updated: 7/11/2026, 2:06:06 PM

class Solution {
    public boolean isSymmetric(TreeNode root) {
       return mirror(root.left,root.right);
    }
    private boolean mirror(TreeNode t1, TreeNode t2){
        if(t1==null&&t2==null) return true;
        if(t1==null || t2==null)return false;
        if(t1.val != t2.val) return false;
        return mirror(t1.left,t2.right) && mirror(t2.left,t1.right);
    }

}