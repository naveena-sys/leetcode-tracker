// Last updated: 7/11/2026, 2:03:29 PM
class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> sort) {
        if(root == null) {
            return ;
        }
        inorder(root.left, sort);
        sort.add(root.val);
        inorder(root.right, sort);
    }
    public int rangeSumBST(TreeNode root, int low, int high) { // sorting method
        int sum = 0;
        ArrayList<Integer> sort = new ArrayList<>();
        inorder(root,sort);

        for(int i=0;i<sort.size();i++) {
            if(sort.get(i) >= low && sort.get(i) <=high) {
                sum += sort.get(i);
            }
        }
        return sum;
    }
}