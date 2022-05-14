package leet_code;

public class ReverseLinkedListQ206 {

	public static void main(String[] args) {
		ReverseLinkedListQ206 reverseLinkedListQ206 = new ReverseLinkedListQ206();
		reverseLinkedListQ206.reverseList(null);
	}
	
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode previous = null;
        ListNode current = head;
        while(head!=null){
            head = head.next;
            current.next = previous;
            previous = current;
            current = head;
        }
        return previous;
    }
}
