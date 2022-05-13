package leet_code;

public class RemoveLinkedListElementsQ203 {

	public static void main(String[] args) {
		RemoveLinkedListElementsQ203 removeLinkedListElementsQ203 = new RemoveLinkedListElementsQ203();
		System.out.println(removeLinkedListElementsQ203.removeElements(null, 0));
	}
	
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode previous = null;
        if(temp == null){
            return null;
        }
        while(temp != null){
            if(temp.val == val){
                if(previous == null){
                    head = head.next;
                    temp = temp.next;
                    if(head == null){
                        return head;
                    }
                    continue;
                }else{
                    previous.next = temp.next;
                    temp = temp.next;
                    continue;
                }
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }
}
