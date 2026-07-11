// Last updated: 7/11/2026, 2:03:21 PM
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left!=null){
            if(root.val!=root.left.val){
                return false;
            }
        }
        if(root.right!=null){
            if(root.val!=root.right.val){
                return false;
            }
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}