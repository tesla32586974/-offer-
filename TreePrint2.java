package algorithm;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class TreePrint2 {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > printList = new ArrayList<ArrayList<Integer> >();
		if(pRoot == null)
			return printList;
		boolean isOld = true; 
		Queue<TreeNode> printQueue =  new LinkedList<TreeNode>(); 
		printQueue.offer(pRoot);
		while(!printQueue.isEmpty()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			Stack<TreeNode> copyStack = new Stack<TreeNode>();
			
			while(!printQueue.isEmpty()){
				copyStack.add(printQueue.poll());
        	}
			
			while(!copyStack.isEmpty()){
				TreeNode node = null;
				if(isOld == true){
					node = copyStack.pop();
					if(node.left != null)
						printQueue.offer(node.left);
					if(node.right != null)
						printQueue.offer(node.right);
					
					list.add(node.val);
				}else{
					node = copyStack.pop();
					if(node.right != null)
						printQueue.offer(node.right);
					if(node.left != null)
						printQueue.offer(node.left);
					list.add(node.val);
				}
			}
			isOld = !isOld;
			printList.add(list);
		}
		return printList;
    }
}
