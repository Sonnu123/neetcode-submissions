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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int diameter = totalheight(root.left)+totalheight(root.right);
        diameter = Math.max(diameter, Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));

        return diameter;
    }
    public int totalheight(TreeNode node){
        if(node == null){
            return 0;
        }
        int lefth = totalheight(node.left);
        int righth = totalheight(node.right);
        return 1+Math.max(lefth,righth);
    }
}
