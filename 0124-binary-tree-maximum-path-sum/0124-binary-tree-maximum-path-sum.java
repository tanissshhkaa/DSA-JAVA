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
    public int maxPathSum(TreeNode root) {
      maxGain(root);
    return ls;
  }
  private int ls = Integer.MIN_VALUE;
  private int maxGain(TreeNode root) {
    if (root == null)
      return 0;
    int l = Math.max(maxGain(root.left), 0);
    int r = Math.max(maxGain(root.right), 0);
    ls = Math.max(ls, root.val + l + r);
    return root.val + Math.max(l, r);
    }
}

