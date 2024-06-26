package leet_code;

public class PathSumQ112 {

	public static void main(String[] args) {
		PathSumQ112 pathSumQ112 = new PathSumQ112();
		System.out.println(pathSumQ112.hasPathSum(null,0));
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
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        targetSum -= root.val;
        if(targetSum == 0 && root.left == null && root.right == null){
            return true;
        }
        return hasPathSum(root.left , targetSum) || hasPathSum(root.right , targetSum);
    }
}
