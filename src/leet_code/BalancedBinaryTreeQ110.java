package leet_code;

public class BalancedBinaryTreeQ110 {

	public static void main(String[] args) {
		BalancedBinaryTreeQ110 balancedBinaryTreeQ110 = new BalancedBinaryTreeQ110();
		System.out.println(balancedBinaryTreeQ110.isBalanced(null));
	}
	int count;
    int maxCount;
    boolean bool = true;
    int left;
    int right;
    
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
    
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        count = 0;
        maxCount = 0;
        left = maxDepth(root.left);
        count = 0;
        maxCount = 0;
        right = maxDepth(root.right);
        if(!((left - right <= 1) && (left-right >= -1))){
            bool = false;
            return false;
        }
        isBalanced(root.left);
        isBalanced(root.right);
        return bool;
    }
    
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
