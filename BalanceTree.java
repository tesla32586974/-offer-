package algorithm;

public class BalanceTree {
	public boolean IsBalanced_Solution(TreeNode root) {
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		if(root.left == null){
			if(root.right.left==null && root.right.right==null)
				return true;
		}
		if(root.right == null){
			if(root.left.left==null && root.left.right==null)
				return true;
		}
		
		int leftTreeDepth = 0;
		int rightTreeDepth = 0;
		leftTreeDepth = TreeDepth(root.left);
		rightTreeDepth = TreeDepth(root.right);
		//左右子树高度最多相差1
		int diff = leftTreeDepth - rightTreeDepth;
		if(diff < -1 || diff > 1)
			return false;
		else
			return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
	
	public int TreeDepth(TreeNode root){
		if(root == null)
			return 0;
		int leftTreeDepth = 0;
		int rightTreeDepth = 0;
		if(root.left != null)
			leftTreeDepth = TreeDepth(root.left);
		if(root.right != null)
			rightTreeDepth = TreeDepth(root.right);
		if(leftTreeDepth > rightTreeDepth)
			return leftTreeDepth + 1;
		else
			return rightTreeDepth + 1;
	}
}
