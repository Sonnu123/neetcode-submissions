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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> bub = new ArrayDeque<>();
        bub.add(root);
        while(!bub.isEmpty()){
            int size = bub.size();
            List<Integer> b = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode c = bub.poll();
                b.add(c.val);
                if(c.left != null){
                    bub.add(c.left);
                }
                if(c.right != null){
                    bub.add(c.right);
                }
            }
            ans.add(b);
        }
        return ans;
    }
}
