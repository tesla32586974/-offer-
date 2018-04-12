package algorithm;

public class TreeDepth {
	public int TreeDepth(TreeNode root) {
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
