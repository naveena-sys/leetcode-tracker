// Last updated: 7/11/2026, 2:03:47 PM
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null ;
        }
        if(val==root.val){
            return root;
        }
        else if(val<root.val){
            return searchBST(root.left,val);
        }
        else{
            return searchBST(root.right,val);
        }
    }
}