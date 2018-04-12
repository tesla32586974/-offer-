package algorithm;

public class DelNode {
	public ListNode deleteDuplication(ListNode pHead)
    {
		if(pHead == null || pHead.next == null)
			return pHead;
		ListNode preNode = pHead;
		ListNode currentNode = preNode.next;
		
		while(currentNode != null){
			if(preNode == pHead && preNode.next !=null && currentNode.value == preNode.value){
				ListNode tempNode = preNode;
				while(tempNode!=null && tempNode.value == currentNode.value){
					tempNode = tempNode.next;
				}
				pHead = tempNode;
				preNode = pHead;
				if(pHead == null)
					return null;
				currentNode = preNode.next;
				continue;
			}
			
			if(currentNode.next !=null && currentNode.value == currentNode.next.value){
				ListNode tempNode = currentNode;
				while(tempNode!=null && tempNode.value == currentNode.value){
					tempNode = tempNode.next;
				}
				preNode.next = tempNode;
				currentNode = tempNode;
				continue;
			}
			preNode = preNode.next;
			currentNode = currentNode.next;
		}
		return pHead;
    }
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next.next = new ListNode(5);
		
		DelNode test = new DelNode();
		test.deleteDuplication(head);
	}
}
