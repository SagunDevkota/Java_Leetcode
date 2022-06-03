package leet_code;

public class SumOfLeftLeavesQ404 {
	
	public static void main(String[] args) {
		SumOfLeftLeavesQ404 sumOfLeftLeavesQ404 = new SumOfLeftLeavesQ404();
		TreeNode node = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		node.left = node2;
		System.out.println(sumOfLeftLeavesQ404.sumOfLeftLeaves(node));
	}
	int sum = 0;
	
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

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                sum+=root.left.val;
            }
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
