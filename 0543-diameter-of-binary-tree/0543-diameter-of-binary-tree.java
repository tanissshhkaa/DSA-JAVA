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
        maxDepth(root);
            return ls;
        }
        private int ls=0;
        int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        
        final int lh=maxDepth(root.left);
        final int rh=maxDepth(root.right);
        ls=Math.max(ls,lh+rh);
        return 1+Math.max(lh,rh);
    }
}