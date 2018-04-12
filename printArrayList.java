package algorithm;
import java.util.ArrayList;
import java.util.Stack;
//从尾到头打印链表
class ListNode{
	public ListNode next = null;
	public int value;
	public ListNode(int value){
		this.value = value;
	}
	public int GetVal(){
		return value;
	}
}

public class printArrayList {

	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 Stack<Integer> stack = new Stack<Integer>();
		 while(listNode != null){
			 stack.push(listNode.value);
			 listNode = listNode.next;
		 }
		 while(!stack.isEmpty()){
			 list.add(stack.pop());
		 }
		 return list;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//构造用例
		ListNode head = new ListNode(0);
		ListNode list1 = head;
		for(int i=1; i<10; i++){
			list1.next = new ListNode(i);
			list1 = list1.next;
		}
		
		ArrayList<Integer> output = new printArrayList().printListFromTailToHead(head);
		for(Integer i : output){
			System.out.print(i+" "); 
		}

	}

}
