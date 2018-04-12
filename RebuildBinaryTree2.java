package algorithm;


public class RebuildBinaryTree2 {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre == null || in == null){
			System.out.println("输入数据不完整！");
			return null;
		}
		return construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }
	
	public TreeNode construct(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn){
		TreeNode node = new TreeNode(0);
		node.val = pre[startPre];
		
		int inFlg = startIn; 
		while(in[inFlg] != pre[startPre])
		{inFlg++;
		}//第几个数是分界点
		
		int k = inFlg - startIn;
		
		if(inFlg == startIn)
			node.left = null;
		else
			node.left = construct(pre, startPre + 1, startPre + k, in, startIn, inFlg - 1);
		if(inFlg == endIn)
			node.right = null;
		else
			node.right = construct(pre, startPre + k + 1, endPre, in, inFlg + 1, endIn);
		return node;
	}
	
	public static void main(String[] args){
		RebuildBinaryTree2 a = new RebuildBinaryTree2();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode node = a.reConstructBinaryTree(pre, in);
		System.out.println(node.val);
	}
}
