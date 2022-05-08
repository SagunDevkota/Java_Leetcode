package leet_code;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreePreorderTraversalQ144 {

	public static void main(String[] args) {
		BinaryTreePreorderTraversalQ144 binaryTreePreorderTraversalQ144 = new BinaryTreePreorderTraversalQ144();
		binaryTreePreorderTraversalQ144.preorderTraversal(null);
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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return node;
        }
        node.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return node;
    }
}
