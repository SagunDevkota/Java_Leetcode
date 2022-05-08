package leet_code;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversalQ145 {

	public static void main(String[] args) {
		BinaryTreePostorderTraversalQ145 binaryTreePostorderTraversalQ145 = new BinaryTreePostorderTraversalQ145();
		binaryTreePostorderTraversalQ145.postorderTraversal(null);
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
	List<Integer> node =new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return node;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        node.add(root.val);
        return node;
    }
}
