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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(height(root.right) - height(root.left)) > 1){
            return false;
        }

        return isBalanced(root.right) && isBalanced(root.left);

    }
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int lefth = height(node.left);
        int righth = height(node.right);

        return 1+Math.max(lefth,righth);
    }
}
