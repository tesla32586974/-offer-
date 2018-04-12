package algorithm;

public class SerialTree {
	StringBuilder str = new StringBuilder();
	int strIndex = -1;
	
	String Serialize(TreeNode root) {
		if(root == null){
			str.append('#');
			str.append(',');
			return str.toString();
		}
		else{
			str.append(root.val);
			str.append(',');
			Serialize(root.left);
			Serialize(root.right);
		}
        return str.toString();
	  }
	
	
	
	TreeNode Deserialize(String str) {
		if(strIndex >= str.length())
			return null;
		TreeNode root = null;
		String[] chrs = str.split(",");
		strIndex++;
		if(chrs[strIndex] != "#"){
			root = new TreeNode(Integer.valueOf(chrs[strIndex]));
			root.left = Deserialize(str);
			root.right = Deserialize(str);
		}
		return root;
	}
}
