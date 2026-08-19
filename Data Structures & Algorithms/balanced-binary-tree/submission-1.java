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
        int heightleft = height(root.left);
        int heightright = height(root.right);
        isBalanced(root.left);
        isBalanced(root.right);

        if(Math.abs(heightright - heightleft) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode Node){
        if(Node == null){
            return 0;
        }
        int leftHeight = height(Node.left);
        int rightHeight = height(Node.right);

        return 1+Math.max(leftHeight, rightHeight);
    }
    

}
