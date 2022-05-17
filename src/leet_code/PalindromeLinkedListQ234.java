package leet_code;

public class PalindromeLinkedListQ234 {

	public static void main(String[] args) {
		PalindromeLinkedListQ234 palindromeLinkedListQ234 = new PalindromeLinkedListQ234();
		System.out.println(palindromeLinkedListQ234.isPalindrome(null));
	}
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode temp = head;
        ListNode revMe = new ListNode();
        ListNode revMeStart = revMe;
        while(temp != null){
            revMe.val = temp.val;
            if(temp.next == null){
                break;
            }
            revMe.next = new ListNode();
            revMe = revMe.next;
            temp = temp.next;
        }
        revMe = null;
        ListNode reversed = reverse(revMeStart);
        revMeStart = null;
        while(reversed != null){
            if(head.val != reversed.val){
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        while(head != null){
            head = head.next;
            current.next = previous;
            previous = current;
            current = head;
        }
        current = null;
        return previous;
    }
}
