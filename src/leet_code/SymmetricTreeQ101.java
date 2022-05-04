package leet_code;

public class SymmetricTreeQ101 {

	public static void main(String[] args) {
		SymmetricTreeQ101 symmetricTreeQ101 = new SymmetricTreeQ101();
		symmetricTreeQ101.isSymmetric(null);
	}
	public boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return false;
		}
        return check(root.left,root.right);
    }
    boolean symmetric = true;
    private boolean check(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null){
            return symmetric;
        }else if(root1 == null){
            symmetric = false;
            return symmetric;
        }else if(root2 == null){
            symmetric = false;
            return symmetric;
        }
        if(root1.val != root2.val){
            symmetric = false;
        }
        check(root1.left,root2.right);
        check(root1.right,root2.left);
        return symmetric;
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
}
