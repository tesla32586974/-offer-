package algorithm;

public class SearchTree {
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree == null)
			return null;
		TreeNode head = ConvertNode(pRootOfTree);  
		return min(head);
    }
	
	public TreeNode ConvertNode(TreeNode pRootOfTree){
		TreeNode a = pRootOfTree; 
		if(pRootOfTree.left!=null){ 
			TreeNode left = pRootOfTree.left;
			pRootOfTree.left = max(pRootOfTree.left);
			ConvertNode(left);
			max(pRootOfTree.left).right = pRootOfTree;
		}
		if(pRootOfTree.right!=null){ 
			TreeNode right = pRootOfTree.right;
			pRootOfTree.right = min(pRootOfTree.right);
			ConvertNode(right);
			min(pRootOfTree.right).left = pRootOfTree;
		}
		return a;
	}
	
	public TreeNode max(TreeNode pRootOfTree){
		TreeNode current = pRootOfTree;
		while(current.right != null){
			current = current.right;
		}
		return current;
	}
	
	public TreeNode min(TreeNode pRootOfTree){
		TreeNode current = pRootOfTree;
		while(current.left != null){
			current = current.left;
		}
		return current;
	}
	
	public static void main(String[] args){
    	TreeNode root1 = new TreeNode(10); 
    	root1.left = new TreeNode(6);
    	root1.left.left = new TreeNode(4);
    	root1.left.right = new TreeNode(8);
    	root1.right = new TreeNode(14);
    	root1.right.left = new TreeNode(12); 
    	root1.right.right = new TreeNode(16);
    	
    	SearchTree a = new SearchTree();
    	a.Convert(root1);
    }
}
