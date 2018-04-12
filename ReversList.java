package algorithm;
import java.util.ArrayList;


public class ReversList {
	

	public ListNode ReverseList(ListNode head) {
		ListNode preNode = head;
		if(head == null || head.next == null)
			return head;
		ListNode currentNode = head.next;
		ListNode nextNode = currentNode.next;
		
		head.next = null;
			
		while(nextNode != null){
			currentNode.next = preNode;
			preNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.next;
		}
		currentNode.next = preNode;
		return currentNode;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode list1 = head;
		for(int i=1; i<10; i++){
			list1.next = new ListNode(i);
			list1 = list1.next;
		}
		
		ListNode output = new ReversList().ReverseList(head);
		while(output!=null){
			System.out.print(output.GetVal()+" "); 
			output = output.next;
		}

	}
}
