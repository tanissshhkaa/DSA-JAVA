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
        String leftSerialize=serialize(root.left);
        String rightSerialize=serialize(root.right);
        return root.val+","+leftSerialize+","+rightSerialize;
    }
    public TreeNode deserialize(String data) {
        String arr[]=data.split(",");
        Queue<String> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        TreeNode root=deserialize(q);
        return root;  
    }

    public static TreeNode deserialize(Queue<String> q){
        if(q.size()==0) return null;
        String peek=q.poll();
        if(peek.equals("X")) return null;
        TreeNode root=new TreeNode(Integer.parseInt(peek));
        root.left=deserialize(q);
        root.right=deserialize(q);
        return root;
    }
}

