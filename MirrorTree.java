package algorithm;

public class MirrorTree {

	static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
	public void Mirror(TreeNode root) {
        if(root == null)
        	return;
		if(root.left !=null)
        	Mirror(root.left);
        if(root.right !=null)
        	Mirror(root.right);
        TreeNode node = null;
        node = root.left;
        root.left = root.right;
        root.right = node;
    }

	 public static void main(String[] args){
	    	TreeNode root1 = new TreeNode(0); 
	    	root1.left = new TreeNode(1);
	    	root1.left.left = new TreeNode(3);
	    	root1.right = new TreeNode(2); 
	    	
	    	MirrorTree a = new MirrorTree();
	    	a.Mirror(root1);
	    }
}
