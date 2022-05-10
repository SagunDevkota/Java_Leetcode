package leet_code;

public class LinkedListCycleQ141 {

	public static void main(String[] args) {
		LinkedListCycleQ141 linkedListCycleQ141 = new LinkedListCycleQ141();
		ListNode head = new ListNode(3);
		ListNode sec = new ListNode(2);
		ListNode th = new ListNode(0);
		ListNode fo = new ListNode(4);
		
		head.next = sec;
		sec.next = th;
		th.next = fo;
		fo.next = sec;
		System.out.println(linkedListCycleQ141.hasCycle(head));
	}
	
	static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        while(head.val != Integer.MAX_VALUE){
            head.val = Integer.MAX_VALUE;
            head = head.next;
            if(head == null){
                return false;
            }
        }
        return true;
    }
}
