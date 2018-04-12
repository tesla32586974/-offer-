package algorithm;
public class SubTree {
	static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
	public boolean isSubtree(TreeNode root1, TreeNode root2){
		if(root2== null)
			return true;
		if(root1 == null)
			return false;
		if(root1.val != root2.val)
			return false;
		return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
        }
	
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	boolean flag = false;
    	if(root1 != null && root2 != null){
    		if(root1.val == root2.val)
    			flag = isSubtree(root1, root2);
    		if(!flag)
    			flag = isSubtree(root1.left, root2);
    		if(!flag)
    			flag = isSubtree(root1.right, root2);
    	}
        return flag;
    }
    
    public static void main(String[] args){
    	TreeNode root1 = new TreeNode(0); 
    	root1.left = new TreeNode(1);
    	root1.left.left = new TreeNode(3);
    	root1.right = new TreeNode(2);
    	
    	TreeNode root2 = new TreeNode(0); 
    	root2.left = new TreeNode(1); 
    	root2.right = new TreeNode(2);
    	
    	SubTree a = new SubTree();
    	a.HasSubtree(root1,root2);
    }
	
}
