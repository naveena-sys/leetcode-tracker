// Last updated: 7/11/2026, 2:06:17 PM
class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traversal(root);
        return list;   
    }
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        list.add(root.val);
        traversal(root.right);
    }
}