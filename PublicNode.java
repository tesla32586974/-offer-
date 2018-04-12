package algorithm;
import java.util.HashMap;
public class PublicNode {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 ListNode publicNode = null;
		 if(pHead1 == null || pHead2==null)
			 return publicNode;
		 HashMap<ListNode, Integer> nodeMap = new HashMap<ListNode, Integer>();
		 //将链表1节点存入Map
		 ListNode currentNode = pHead1;
		 while(currentNode != null){
			 nodeMap.put(currentNode, 1);
			 currentNode = currentNode.next;
		 }
		 //遍历链表2，检查公共节点
		 currentNode = pHead2;
		 while(currentNode != null){
			 if(nodeMap.get(currentNode) != null)
				break; 
			 currentNode = currentNode.next;
		 }
		 return currentNode;
    }
}
