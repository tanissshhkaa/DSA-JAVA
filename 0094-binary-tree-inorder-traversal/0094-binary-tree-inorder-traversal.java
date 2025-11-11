// Morris Inorder Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        TreeNode node = root;
        while (node != null) {
            if (node.left == null) {
                ls.add(node.val);
                node = node.right;
            } else {
                TreeNode prev = node.left;
                while (prev.right != null && prev.right != node)
                    prev = prev.right;
                
                if (prev.right == null) {
                    prev.right = node;
                    node = node.left;
                } else {
                    prev.right = null;
                    ls.add(node.val);
                    node = node.right;
                }
            }
        }
        return ls;
    }
}

