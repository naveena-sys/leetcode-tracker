// Last updated: 7/11/2026, 2:06:00 PM
class Solution {
    public int minDepth(TreeNode root) {
       if(root==null){
        return 0;
       } 
       int leftDepth=minDepth(root.left);
       int rightDepth=minDepth(root.right);
       if(root.left==null) return 1 + rightDepth;
       if(root.right==null) return 1 + leftDepth;
       if (leftDepth < rightDepth) {
            return 1 + leftDepth;
        } else {
            return 1 + rightDepth;
        }
    }
}



