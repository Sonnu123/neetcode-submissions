/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode bub = new TreeNode(val);
        if(root == null){
            return bub;
        }
        if(val < root.val){
            if(root.left == null){
                root.left = bub;
                return root;
            }
            else{
                insertIntoBST(root.left, val);
            }
        }
        else{
            if(root.right == null){
                root.right = bub;
                return root;
            }
            else{
                insertIntoBST(root.right, val);
            }
        }
        return root;
    }
}