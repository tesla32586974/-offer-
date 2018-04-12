package algorithm;

public class FindNode {
	int index = 0;
	TreeNode readNode = null;
	TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(pRoot == null)
			return null;
		MidOrder(pRoot, k);
        return readNode;
    }
	void MidOrder(TreeNode pRoot, int k){
		if(index == k)
			return;
		TreeNode node = pRoot;
		if(node.left != null){
			MidOrder(pRoot.left, k);
		}
		System.out.println(index);
		index++;
		if(index == k)
			readNode = pRoot;
		if(node.right != null){
			MidOrder(pRoot.right, k);
		}
	}
	
	public static void main(String[] args){
    	TreeNode root1 = new TreeNode(0); 
    	root1.left = new TreeNode(1);
    	root1.left.left = new TreeNode(3);
    	root1.left.left.left = new TreeNode(3);
    	root1.right = new TreeNode(2);
    	
    	FindNode a = new FindNode();
    	a.KthNode(root1, 1);
    }
	
}
