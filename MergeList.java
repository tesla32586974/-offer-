package algorithm;

public class MergeList {
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		ListNode current1Node,current2Node,head;
		if(list1.value<list2.value){
			head = list1;
			current1Node = list1.next;
			current2Node = list2;
		}else{
			head = list2;
			current1Node = list1;
			current2Node = list2.next;
		}
		ListNode currentNode = head;
		
		while(currentNode!=null){
			if(current1Node == null && current2Node == null){
				currentNode.next = null;
				break;
			}
			if(current2Node == null ){
				currentNode.next = current1Node;
				current1Node = current1Node.next;
			}
			else if(current1Node == null){
				currentNode.next = current2Node;
				current2Node = current2Node.next;
			}
			else if(current1Node.value < current2Node.value){
				currentNode.next = current1Node;
				current1Node = current1Node.next;
			}
			else if(current1Node.value >= current2Node.value){
				currentNode.next = current2Node;
				current2Node = current2Node.next;
			}
			currentNode = currentNode.next;
		}
		return head;
    }
	public static void main(String [] args){
		ListNode list1 = new ListNode(0);
		ListNode current1 = list1;
		ListNode list2 = new ListNode(0);
		ListNode current2 = list2;
		for(int i=1; i<6; i=i+2){
			current1.next = new ListNode(i);
			current1 = current1.next;
		}
		for(int i=2; i<7; i=i+2){
			current2.next = new ListNode(i);
			current2 = current2.next;
		}

		
		ListNode list = new MergeList().Merge(list1, list2);
		while(list!=null){
			System.out.print(" "+list.value);
			list = list.next;
		}
	}
}
