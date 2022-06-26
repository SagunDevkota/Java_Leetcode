package leet_code;

public class SwapNodesInPairsQ24 {

	public static void main(String[] args) {
		SwapNodesInPairsQ24 swapNodesInPairsQ24 = new SwapNodesInPairsQ24();
//		ListNode l5 = new ListNode(5);
		ListNode l4 = new ListNode(4);
		ListNode l3 = new ListNode(3, l4);
		ListNode l2 = new ListNode(2, l3);
		ListNode l1 = new ListNode(1,l2);
		ListNode res = swapNodesInPairsQ24.swapPairs(l1);
		System.out.println("res "+res);
		while(res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	public ListNode swapPairs(ListNode head) {
		if(head == null) {
			return null;
		}else if(head.next == null) {
			return head;
		}else if(head.next.next == null) {
			ListNode temp = head;
			head = head.next;
			head.next = temp;
			temp.next = null;
			return head;
		}
        ListNode first = head.next.next;
        ListNode second = head.next;
        ListNode ret = second;
        ListNode third = head;
        boolean flag = false;
        while(first != null) {
        	third.next = first.next;
        	if(flag) {
        		first.next = third;
        		third = null;
        		second = null;
        		first = null;
        	}else {
        		second.next = third;
        		if(first.next == null) {
        			third.next = first;
        			break;
        		}
            	third = first;
            	second = first.next;
            	if(first.next.next != null) {
            		first = first.next.next;
            	}else {
            		first = first.next;
            		flag = true;
            	}
        	}
//        	second.next = third;
        	
        }
        return ret;
    }
}
