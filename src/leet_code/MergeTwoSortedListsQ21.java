package leet_code;
public class MergeTwoSortedListsQ21 {
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	public static void main(String[] args) {
		MergeTwoSortedListsQ21 mergeTwoSortedListsQ21 = new MergeTwoSortedListsQ21();
		ListNode listNode1 = new ListNode();
		ListNode listNode2 = new ListNode();
		ListNode listNode3 = new ListNode();
		ListNode listNode4 = new ListNode();
		ListNode listNode5 = new ListNode();
		ListNode listNode6 = new ListNode();
		
		listNode1.val = 1;
		listNode1.next = listNode2;
		
		listNode2.val = 2;
		listNode2.next = listNode3;
		
		listNode3.val = 4;
		listNode3.next = null;
		
		listNode4.val = 1;
		listNode4.next = listNode5;
		
		listNode5.val = 3;
		listNode5.next = listNode6;
		
		listNode6.val = 4;
		listNode6.next = null;
		ListNode n = mergeTwoSortedListsQ21.mergeTwoLists(listNode1,listNode4);
		while(n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}	 
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	    	if(list1 == null) {
	        	return list2;
	        }
	        if(list2 == null) {
	        	return list1;
	        }
	        ListNode temp;
	        if(list1.val <list2.val) {
	        	temp = new ListNode(list1.val);
	        	list1 = list1.next;
	        }else{
	        	temp = new ListNode(list2.val);
	        	list2 = list2.next;
	        }
	        ListNode head = temp;
	        while(!(list1 == null && list2 == null)) {
	        	if(list1 == null) {
	        		temp.next = new ListNode(list2.val);
	        		list2 = list2.next;
	        	}else if(list2 == null) {
	        		temp.next = new ListNode(list1.val);
	        		list1 = list1.next;
	        	}else if(list1.val == list2.val) {
	        		temp.next = new ListNode(list1.val);
	        		temp = temp.next;
	        		temp.next = new ListNode(list2.val);
	        		list1 = list1.next;
	        		list2 = list2.next;
	        	}else if(list1.val<list2.val) {
	        		temp.next = new ListNode(list1.val);
	        		list1 = list1.next;
	        	}else if(list2.val < list1.val) {
	        		temp.next = new ListNode(list2.val);
	        		list2 = list2.next;
	        	}
	        	temp = temp.next;
	        }
			return head;
	}

}
