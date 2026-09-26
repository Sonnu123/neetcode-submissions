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
    int ans = 1;
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null){
                checker(root.left,root.val);
            }
        if(root.right != null){
                checker(root.right,root.val);
            }
        return ans;
    }
    public void checker(TreeNode node, int max){
        if(node.val < max){
            if(node.left != null){
                checker(node.left,max);
            }
            if(node.right != null){
                checker(node.right,max);
            }
        }
        else{
            ans++;
            if(node.left != null){
                checker(node.left,node.val);
            }
            if(node.right != null){
                checker(node.right,node.val);
            }
        }
    }
}
