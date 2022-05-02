package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
 */
public class RemoveDuplicatesfromSortedListQ83 {

	public static void main(String[] args) {
		RemoveDuplicatesfromSortedListQ83 removeDuplicatesfromSortedListQ83 = new RemoveDuplicatesfromSortedListQ83();
		removeDuplicatesfromSortedListQ83.deleteDuplicates(null);
	}
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode returnNode = new ListNode();
        ListNode temp = returnNode;
        while(head!=null){
            returnNode.val = head.val;
            while(returnNode.val == head.val){
                head = head.next;
                if(head == null){
                    return temp;
                }
            }
            returnNode.next = new ListNode();
            returnNode = returnNode.next;
        }
        return temp;
    }
}
