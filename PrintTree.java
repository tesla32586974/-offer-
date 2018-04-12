package algorithm;
import java.util.ArrayList;
import java.util.Stack;

public class PrintTree {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> printList = new ArrayList<Integer>();
		if(root == null)
			return printList;
        Stack<TreeNode> print = new Stack<TreeNode>();
        print.add(root);
        while(!print.isEmpty()){
        	Stack<TreeNode> print2 = new Stack<TreeNode>();
        	while(!print.isEmpty()){
        		print2.add(print.pop());
        	}
        	while(!print2.isEmpty()){
        		TreeNode node = print2.pop();
        		printList.add(node.val);
        		System.out.println(node.val);
        		 if(node.left != null)
        	        print.add(node.left);
        		 if(node.right != null)
     	        	print.add(node.right);
            }
        }
        
		return printList;
    }
	
	public static void main(String[] args){
    	TreeNode root1 = new TreeNode(0); 
    	root1.left = new TreeNode(1);
    	root1.left.left = new TreeNode(3);
    	root1.left.left.left = new TreeNode(3);
    	root1.right = new TreeNode(2);
    	
    	PrintTree a = new PrintTree();
    	a.PrintFromTopToBottom(root1);
    }
}
