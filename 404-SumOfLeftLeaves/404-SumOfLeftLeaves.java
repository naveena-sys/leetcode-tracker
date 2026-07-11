// Last updated: 7/11/2026, 2:04:20 PM
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null){
            return 0;
        }
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                sum+=root.left.val;
            }else{
                sum+=sumOfLeftLeaves(root.left);
            }
        }
       sum+=sumOfLeftLeaves(root.right);
       return sum;
    }
}