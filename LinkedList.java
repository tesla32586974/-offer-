package algorithm;





public class LinkedList {
	static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null)
			return null;
		ListNode current = head;
		int size = 0;
        while(current != null){
        	size++;
        	current = current.next;
        }
        
        int i = size - k;
        if(i<0)
        	return null;
        current = head;
		while(i-- != 0){
			current = current.next;
        }
		
		return current;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		ListNode current = head;
		
		for(int i=2; i<5; i++){
			current = current.next;
			current.next = new ListNode(i);
			
		}
		current = null;
		
		LinkedList a = new LinkedList();
		System.out.println(a.FindKthToTail(head,1).val);
	}

}
