package algorithm;
import java.util.LinkedList;

 

class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;

	    RandomListNode(int label) {
	        this.label = label;
	    }
	}

public class ComplexList {
	
	
	public RandomListNode Clone(RandomListNode pHead){
		if(pHead == null)
			return null;
		RandomListNode current = pHead;
		RandomListNode headClone = new RandomListNode(current.label);
		RandomListNode curClone = headClone;
		 
		//复制链表
		while(current.next!=null){
			curClone.next = new RandomListNode(current.next.label);
			curClone = curClone.next;
			current = current.next;
		}
		//记录随机指针 
		current = pHead;
		curClone = headClone;
		while(current!=null){
			 if(current.random != null){
				 RandomListNode node = current.random;
				 RandomListNode curNode = headClone;
				 while(curNode.next !=null && curNode.label != node.label){
					 curNode = curNode.next;
				 }
				 curClone.random = curNode;
			 }
			current = current.next;
			curClone = curClone.next;
		}
		
		return headClone;
    }
	
	public static void main(String[] args){
		RandomListNode root1 = new RandomListNode(0); 
    	root1.next = new RandomListNode(1);
    	root1.next.next = new RandomListNode(2);
    	root1.next.next.next = new RandomListNode(3); 
    	root1.next.random = root1.next.next.next;
    	
    	ComplexList a = new ComplexList();
    	a.Clone(root1);
    }
}
