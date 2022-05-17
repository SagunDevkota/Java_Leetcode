package leet_code;

public class DeleteNodeInALinkedListQ237 {

	public static void main(String[] args) {
		DeleteNodeInALinkedListQ237 deleteNodeInALinkedListQ237 = new DeleteNodeInALinkedListQ237();
		deleteNodeInALinkedListQ237.deleteNode(null);
	}
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	/**
	 * 
	 * @param node (node is not a tail node)
	 * constraints
	 * every element is unique
	 * we don't have access to head node rather we only have access to the node that is to be deleted
	 * Minimum number of node = 2
	 */
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
