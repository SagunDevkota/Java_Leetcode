package leet_code;

public class ValidateBinarySearchTreeQ98 {
	boolean ret = true;
    Integer last = null;
	public static void main(String[] args) {
		ValidateBinarySearchTreeQ98 validateBinarySearchTreeQ98 = new ValidateBinarySearchTreeQ98();
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(6);
		TreeNode n3 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		System.out.println(validateBinarySearchTreeQ98.isValidBST(n1));
	}
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return false;
        }
        isValidBST(root.left);
        if(last != null && last>=root.val){
            ret = false;
            return false;
        }
        last = root.val;
        isValidBST(root.right);
        return ret;
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
     
}
