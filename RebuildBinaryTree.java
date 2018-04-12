package algorithm;
import java.util.LinkedList;




class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  } 

public class RebuildBinaryTree {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre == null || in == null){
			System.out.println("输入数据不完整！");
			return null;
		}
		LinkedList<Integer> preList = new LinkedList<Integer>();
		LinkedList<Integer> inList = new LinkedList<Integer>();
		for(int i=0; i<pre.length; i++){
			preList.add(pre[i]);
		}
		for(int i=0; i<in.length; i++){
			inList.add(in[i]);
		} 
		
		return construct(preList, inList);
    }
	
	public TreeNode construct(LinkedList<Integer> pre, LinkedList<Integer> in){
		TreeNode node = new TreeNode(0);
		node.val = pre.getFirst();
		
		LinkedList<Integer> letfInList = new LinkedList<Integer>();
		LinkedList<Integer> rightInList = new LinkedList<Integer>();
		
		LinkedList<Integer> letfPreList = new LinkedList<Integer>();
		LinkedList<Integer> rightPreList = new LinkedList<Integer>();
		int i=0;
		for(; in.get(i) != node.val; i++){
			letfInList.add(in.get(i));
		}
		for(int k=i+1; k<in.size(); k++){
			rightInList.add(in.get(k));
		}
		
		for(Integer item : pre){
			if(letfInList.contains(item))
				letfPreList.add(item);
			if(rightInList.contains(item))
				rightPreList.add(item);
		}
			
		if(letfInList.size() == 0){
			node.left =null ;
		}else{
			node.left = construct(letfPreList, letfInList);
		}
		
		if(rightInList.size() == 0){
			node.right =null ;
		}else{
			node.right = construct(rightPreList, rightInList);
		} 
		return node;
	}
	
	public static void main(String[] args){
		RebuildBinaryTree a = new RebuildBinaryTree();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode node = a.reConstructBinaryTree(pre, in);
		System.out.println(node.val);
	}
}
