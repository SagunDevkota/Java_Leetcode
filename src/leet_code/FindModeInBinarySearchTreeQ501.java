package leet_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindModeInBinarySearchTreeQ501 {

	public static void main(String[] args) {
		FindModeInBinarySearchTreeQ501 findModeInBinarySearchTreeQ501 = new FindModeInBinarySearchTreeQ501();
		TreeNode tn = new TreeNode(5);
		TreeNode tnr = new TreeNode(6);
		TreeNode tnl = new TreeNode(4);
		tn.left = tnl;
		tn.right = tnr;
		int[] findMode = findModeInBinarySearchTreeQ501.findMode(tn);
		for(int i:findMode) {
			System.out.println(i);
		}
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
	    HashMap<Integer,Integer> nodeMap = new HashMap<>();
	    int max = 1;
	    public int[] findMode(TreeNode root) {
	        traverse(root);
	        ArrayList<Integer> ret = new ArrayList<>();
	        for(Map.Entry<Integer,Integer> e: nodeMap.entrySet()){
	            if(e.getValue() == max){
	                ret.add(e.getKey());
	            }
	        }
	        return ret.stream().mapToInt(i -> i).toArray();
	    }
	    private void traverse(TreeNode root){
	        if(root == null){
	            return;
	        }
	        traverse(root.left);
	        Integer value = nodeMap.get(root.val);
	        if(value != null){
	            nodeMap.put(root.val,nodeMap.get(root.val)+1);
	            if(max < value+1){
	                max = value+1;
	            }
	        }else{
	            nodeMap.put(root.val,1);
	        }
	        traverse(root.right);
	    }
}
