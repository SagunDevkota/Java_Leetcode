package leet_code;

public class RemoveNthNodeFromEndOfListQ19 {

	public static void main(String[] args) {
		  RemoveNthNodeFromEndOfListQ19 removeNthNodeFromEndOfListQ19 = new RemoveNthNodeFromEndOfListQ19();
		  System.out.println(removeNthNodeFromEndOfListQ19.removeNthFromEnd(null, 0));
		 
	}
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
  public ListNode removeNthFromEnd(ListNode head, int n) { 
	  ListNode front =head; 
	  ListNode rear = head; 
	  for(int i = 0;i<n;i++){
	        if(front == null){
	            return null;
	        }
        	front = front.next;
        }
        if(front == null){
            return head.next;
        }
        while(front.next != null){
        	
            front = front.next;
            rear = rear.next;
        }
        rear.next = rear.next.next;
        return head;
    }
}
