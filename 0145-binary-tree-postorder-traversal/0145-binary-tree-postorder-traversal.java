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


//ITERATIVE APPROACH-using 1 stack
// class Solution{
//     public List<Integer> postorderTraversal(TreeNode root){
//         List<Integer> ls=new ArrayList<>();
//         Stack<TreeNode> st=new Stack<>();
//         TreeNode node=root , last=null;
//         while (node!=null || !st.isEmpty()){
//         if(node!=null){
//             st.push(node);
//             node=node.left;
//         }else{
//             TreeNode peek=st.peek();
//             if(peek.right!=null && last != peek.right){
//                 node=peek.right;
//             }else{
//                 ls.add(peek.val);
//                 last=st.pop();
//             }
//         }
//         }
//         return ls;
//     }
// }

//ITERATIVE APPROACH-using 2 stack
class Solution{
    public List<Integer> postorderTraversal(TreeNode root){
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        List<Integer> ls=new ArrayList<>();
        if(root==null){
            return ls;
        }
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.add(root);
            if(root.left!=null){
                st1.push(root.left);
            }
            if(root.right!=null){
                st1.push(root.right);
            }
        }
            while(!st2.isEmpty()){
                ls.add(st2.pop().val);
            }
        return ls;   
    }
}
