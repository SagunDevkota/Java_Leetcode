package leet_code;

public class MaximumDepthOfBinaryTreeQ104 {

	public static void main(String[] args) {
		MaximumDepthOfBinaryTreeQ104 maximumDepthOfBinaryTreeQ104 = new MaximumDepthOfBinaryTreeQ104();
		System.out.println(maximumDepthOfBinaryTreeQ104.maxDepth(null));
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
	int count = 0;
    int maxCount = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            if(maxCount < count){
                maxCount = count;
            }
            return 0;
        }
        count++;
        maxDepth(root.left);
        maxDepth(root.right);
        count--;
        return maxCount;
    }
}
