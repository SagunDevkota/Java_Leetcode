package leet_code;

public class InvertBinaryTreeQ226 {

	public static void main(String[] args) {
		InvertBinaryTreeQ226 invertBinaryTreeQ226 = new InvertBinaryTreeQ226();
		System.out.println(invertBinaryTreeQ226.invertTree(null));
	}
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
