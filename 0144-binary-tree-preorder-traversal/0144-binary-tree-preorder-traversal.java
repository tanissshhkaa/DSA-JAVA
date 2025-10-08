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


// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> ls = new ArrayList<>();
//         preorder(root,ls);
//         return ls;
        
//     }

//     public void preorder(TreeNode root, List<Integer> ls){
//         if(root==null) return;
//         ls.add(root.val);
//         preorder(root.left,ls);
//         preorder(root.right,ls);
//     }
// }
    
class Solution{
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<Integer>();
        if(root==null) return preorder;
        Stack<TreeNode> st=new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            preorder.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return preorder;
    }
}
