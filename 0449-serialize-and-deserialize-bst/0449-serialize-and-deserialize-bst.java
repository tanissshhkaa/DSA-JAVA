/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        if(root==null) return "X";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);  
    }

    public TreeNode deserialize(String data) {
        String arr[]=data.split(",");
        Queue<String> q=new LinkedList<>();
        for(String s:arr){
            q.add(s);
        }
        return buildTree(q);
    }
    public TreeNode buildTree(Queue<String> q){
        String val=q.poll();
        if(val.equals("X")) return null;
        TreeNode node=new TreeNode(Integer.parseInt(val));
        node.left=buildTree(q);
        node.right=buildTree(q);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;