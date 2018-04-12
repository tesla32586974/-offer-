package algorithm;

public class SymmetricTree {
	boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null)
        	return true;
        boolean s = isEqualTree(pRoot.left, pRoot.right);
        return s;
    }
	
	
	boolean isEqualTree(TreeNode nodeA, TreeNode nodeB){
		if(nodeA == null ){
			if(nodeB == null)
				return true;
			else
				return false;
		}else{
			if(nodeB == null)
				return false;
			else{
				if(nodeA.val != nodeB.val)
					return false;
				else
					return isEqualTree(nodeA.left, nodeB.right) && isEqualTree(nodeA.right, nodeB.left);
			}			
		}
		
	}
	
	
}
