package leet_code;

/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/same-tree/
 */
public class SameTreeQ100 {

	public static void main(String[] args) {
		SameTreeQ100 sameTreeQ100 = new SameTreeQ100();
		sameTreeQ100.isSameTree(null, null);
	}
    boolean equal = true;
    
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
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorderTraversal(p,q);
        if(equal){
            return true;
        }
        return false;
    }
    public void inorderTraversal(TreeNode root,TreeNode root2) {
        if(root == null && root2 == null){
            return;
        }
        if(root == null){
            equal = false;
            return;
        }
        if(root2 == null){
            equal = false;
            return;
        }
        if(root.val != root2.val){
            equal = false;
            return;
        }
        inorderTraversal(root.left,root2.left);
        inorderTraversal(root.right,root2.right);
    }
}
