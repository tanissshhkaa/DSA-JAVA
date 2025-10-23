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
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ls= new ArrayList<>();
//         postorder(root,ls);
//         return ls;  
//     }


//     public void postorder(TreeNode root, List<Integer> ls){
//         if(root==null) return;
//         postorder(root.left,ls);
//         postorder(root.right,ls);
//         ls.add(root.val);
//     }
// }

class Solution{
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ls=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode ans=root , last=null;
        while (ans!=null || !st.isEmpty()){
        if(ans!=null){
            st.push(ans);
            ans=ans.left;
        }else{
            TreeNode peek=st.peek();
            if(peek.right!=null && last != peek.right){
                ans=peek.right;
            }else{
                ls.add(peek.val);
                last=st.pop();
            }
        }
        }
        return ls;
    }
}