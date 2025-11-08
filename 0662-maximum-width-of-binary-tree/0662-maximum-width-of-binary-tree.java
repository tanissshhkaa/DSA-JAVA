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


class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node, int num){
    this.node=node;
    this.num=num;
}
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int width = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            int min = q.peek().num; // first index in this level
            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                int curr_Id = q.peek().num - min; // normalized index
                TreeNode node = q.peek().node;
                q.poll();
                if (i == 0) first = curr_Id;
                if (i == size - 1) last = curr_Id;
                if (node.left != null)
                    q.add(new Pair(node.left, curr_Id * 2 + 1));
                if (node.right != null)
                    q.add(new Pair(node.right, curr_Id * 2 + 2));
            }
            width = Math.max(width, last - first + 1);
        }
        return width;
    }
}















































