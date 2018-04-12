package algorithm;
import java.util.HashMap;


public class ChildrenGift {
	public int LastRemaining_Solution(int n, int m) {
        if(n == 0)
        	return -1;
		//构造小朋友
		int[] children = new int[n];
		for(int i=0; i<n; i++)
			children[i] = i;
		return gift(children, m);
    }
	
	public int gift(int[] n, int m){
		if(n.length == 1)
			return n[0];
		int remove = (m- 1)%n.length;
		int[] subArr = new int[n.length - 1];
		for(int i=remove + 1; i<n.length; i++){
			subArr[i - (remove + 1)] = n[i];
		}
		for(int i=0; i<remove; i++){
			subArr[i + n.length - (remove + 1)] = n[i];
		}
				
		return gift(subArr, m);
	}
	
	public static void main(String[] args){
		ChildrenGift a = new ChildrenGift();
		a.LastRemaining_Solution(5, 3);
	}
}
