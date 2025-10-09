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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> ls=new ArrayList<>();
        if(root==null){
            return ls;
        }
    Deque<TreeNode> queue=new ArrayDeque<>();
    queue.offer(root);

    while(!queue.isEmpty()){
        List<Integer> currentLevel = new ArrayList<>();
        int levelSize=queue.size();
        for(int i=0;i<levelSize;i++){
            TreeNode currentNode = queue.poll();
            currentLevel.add(currentNode.val);
            if(currentNode.left!=null){
                queue.offer(currentNode.left);
            }
             if(currentNode.right!=null){
                queue.offer(currentNode.right);
            }
        }
        ls.add(0,currentLevel);
    }
    return ls;
        
    }
}