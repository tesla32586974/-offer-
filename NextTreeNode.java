package algorithm;

public class NextTreeNode {
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		TreeLinkNode parentNode = pNode.next;
		TreeLinkNode rtnNode = null;
	
		if(parentNode == null){
			//根节点
			if(pNode.right != null){
				rtnNode = pNode.right;
				while(rtnNode.left != null){
					rtnNode = rtnNode.left;
				}
			}else{
				rtnNode = pNode.right;
			}
			
				
		}else if(parentNode.left == pNode){
			//当前节点是左支
			if(pNode.right != null){
				rtnNode = pNode.right;
				while(rtnNode.left != null){
					rtnNode = rtnNode.left;
				}
			}else
				rtnNode = parentNode;
		}else if(parentNode.right == pNode){
			//当前节点是右支
			if(pNode.right != null){
				rtnNode = pNode.right;
				while(rtnNode.left != null)
					rtnNode = rtnNode.left;
			}else{
				TreeLinkNode tempNode = pNode;
				rtnNode = pNode.next;
				while(rtnNode.left != tempNode){
					tempNode = rtnNode;
					rtnNode = rtnNode.next;
					if(rtnNode == null)
						break;
				}
			}
		}
		return rtnNode;
    }
}
