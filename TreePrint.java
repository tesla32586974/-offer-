package algorithm;
import java.util.ArrayList;
import java.util.Stack;


public class TreePrint {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > printList = new ArrayList<ArrayList<Integer> >();
		if(pRoot == null)
			return printList;
		boolean isOld = true;
		Stack<TreeNode> printStack = new Stack<TreeNode>();
		printStack.add(pRoot);
		while(!printStack.isEmpty()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			Stack<TreeNode> copyStack1 = new Stack<TreeNode>();
			Stack<TreeNode> copyStack = new Stack<TreeNode>();
			
			while(!printStack.isEmpty()){
				copyStack1.add(printStack.pop());
        	}
			while(!copyStack1.isEmpty()){
				copyStack.add(copyStack1.pop());
        	}
			
			while(!copyStack.isEmpty()){
				TreeNode node = null;
				if(isOld == true){
					node = copyStack.pop();
					if(node.left != null)
						printStack.add(node.left);
					if(node.right != null)
						printStack.add(node.right);
					
					list.add(node.val);
				}else{
					node = copyStack.pop();
					if(node.right != null)
						printStack.add(node.right);
					if(node.left != null)
						printStack.add(node.left);
					list.add(node.val);
				}
			}
			isOld = !isOld;
			printList.add(list);
		}
		return printList;
    }
}
