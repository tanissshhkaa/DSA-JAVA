/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> map = new HashMap<>();
    Set<TreeNode> visited = new HashSet<>();
    List<Integer> ls = new ArrayList<>(); 
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        map(root);
        dK(target, k);
        return ls;  
    }
     public void map(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null){
            map.put(root.left, root);
            map(root.left);
        }
        if(root.right != null){
            map.put(root.right, root);
            map(root.right);
        }
    }
    public void dK(TreeNode target, int k){
        if(target == null || visited.contains(target)){
            return;
        }
        visited.add(target);
        if(k == 0){
            ls.add(target.val);
            return;
        }
        dK(target.left,  k - 1);
        dK(target.right, k - 1);
        dK(map.get(target), k - 1);
}
}