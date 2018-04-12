package algorithm;
import java.util.ArrayList;

public class JudgeTreeRoute {
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<Integer> route = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> allRoute = new ArrayList<ArrayList<Integer>>();
		findPath(root, target, allRoute, route, 0);
		return allRoute;
    }
	public void findPath(TreeNode node,int target,ArrayList<ArrayList<Integer>> allRoute, ArrayList<Integer> list,int sum){
		if(node == null)
			return;
		sum = node.val + sum;
		list.add(node.val);
		if(sum == target && node.left==null && node.right == null){
			allRoute.add(list);
		}
		else if(sum > target)
			return;
		ArrayList<Integer> listLeft = new ArrayList<Integer>();
		ArrayList<Integer> listRight = new ArrayList<Integer>();
		listLeft.addAll(list);
		listRight.addAll(list);
		findPath(node.left, target, allRoute, listLeft, sum);
		findPath(node.right, target, allRoute, listRight, sum);
	}
	
	public static void main(String[] args){
    	TreeNode root1 = new TreeNode(10); 
    	root1.left = new TreeNode(5);
    	root1.left.left = new TreeNode(4);
    	root1.left.right = new TreeNode(7);
    	root1.right = new TreeNode(12);
    	
    	JudgeTreeRoute a = new JudgeTreeRoute();
    	a.FindPath(root1, 22);
    }
}
