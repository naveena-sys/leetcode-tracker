// Last updated: 7/11/2026, 2:03:46 PM
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(val>root.val){
           root.right=insertIntoBST(root.right,val);
        }
        else if(val<root.val){
           root.left= insertIntoBST(root.left,val);
        }
        return root;
    }
}



