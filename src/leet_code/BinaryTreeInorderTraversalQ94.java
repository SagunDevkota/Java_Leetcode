package leet_code;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class BinaryTreeInorderTraversalQ94 {
	LinkedList<Integer> ll = new LinkedList<>();
	public static void main(String[] args) {
		BinaryTreeInorderTraversalQ94 binaryTreeInorderTraversalQ94 = new BinaryTreeInorderTraversalQ94();
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(4);
		node.right = new TreeNode(7);
		System.out.println(binaryTreeInorderTraversalQ94.inorderTraversal(node));
	}
	
	public static class TreeNode {
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
		 
	
	public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null){
            inorderTraversal(root.left);
            ll.add(root.val);
            inorderTraversal(root.right);
        }
        return ll;
    }
}
