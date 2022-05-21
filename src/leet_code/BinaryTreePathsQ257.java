package leet_code;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsQ257 {

	public static void main(String[] args) {
		BinaryTreePathsQ257 binaryTreePathsQ257 = new BinaryTreePathsQ257();
		TreeNode tn = new TreeNode(5);
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(6);
		tn.left = tn1;
		tn1.right = tn2;
		tn.right = tn3;
		System.out.println(binaryTreePathsQ257.binaryTreePaths(tn));
	}
	static public class TreeNode {
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
	ArrayList<String> al = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return al;
    }
    public void dfs(TreeNode root,String path){
        if(root == null){
            return;
        }
        path += "->"+root.val;
        if(root.left == null && root.right == null){
            al.add(path.substring(2));
        }
        dfs(root.left,path);
        dfs(root.right,path);
    }
}
