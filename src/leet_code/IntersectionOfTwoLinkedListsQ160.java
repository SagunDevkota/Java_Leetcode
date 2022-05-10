package leet_code;


public class IntersectionOfTwoLinkedListsQ160 {

	public static void main(String[] args) {
		IntersectionOfTwoLinkedListsQ160 intersectionOfTwoLinkedListsQ160 = new IntersectionOfTwoLinkedListsQ160();
		intersectionOfTwoLinkedListsQ160.getIntersectionNode(null, null);
	}
	
	static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = lengthNode(headA);
        int bLen = lengthNode(headB);
        ListNode[] aArray = new ListNode[aLen];
        ListNode[] bArray = new ListNode[bLen];
        int count = 0;
        while(headA != null){
            aArray[count] = headA;
            headA = headA.next;
            count++;
        }
        count = 0;
        while(headB != null){
            bArray[count] = headB;
            headB = headB.next;
            count++;
        }
        ListNode ret = null;
        while (true){
            if(aArray[aLen-1] == bArray[bLen-1]){
                ret = aArray[aLen-1];
                aLen--;
                bLen--;
            }else{
                return ret;
            }
            if(aLen == 0 || bLen == 0){
                return ret;
            }
        }
    }
    public int lengthNode(ListNode head){
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }
}
