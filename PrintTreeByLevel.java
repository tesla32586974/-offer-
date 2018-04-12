package algorithm;
import java.util.ArrayList;
import java.util.Stack;


public class PrintTreeByLevel {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > printList = new ArrayList<ArrayList<Integer> >();
		if(pRoot == null)
			return printList;
		 
		Stack<TreeNode> printStack = new Stack<TreeNode>();
		printStack.add(pRoot);
		while(!printStack.isEmpty()){
			ArrayList<Integer> list = new ArrayList<Integer>();
 
			Stack<TreeNode> copyStack = new Stack<TreeNode>();
			
 
		
			
			while(!copyStack.isEmpty()){
				TreeNode node = null;
				node = copyStack.pop();
				if(node.left != null)
					printStack.add(node.left);
				if(node.right != null)
					printStack.add(node.right); 
				list.add(node.val); 
			}
			printList.add(list);
		}
		return printList;
    }
}
