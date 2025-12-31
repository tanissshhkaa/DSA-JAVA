// Morris Inorder Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
     List<Integer> list=new ArrayList<>();
     Stack<TreeNode> st=new Stack<>();
     TreeNode ls=root;
     while(ls!=null || !st.isEmpty()){
        if(ls!=null){
            st.push(ls);
            ls=ls.left;
        }else{
            ls=st.pop();
            list.add(ls.val);
            ls=ls.right;
        }
     }
     return list;
    }
}