package algorithm;

public class PlusNum {
	public int Sum_Solution(int n) {
		int sum = n;
		boolean a = n>0 && (sum += Sum_Solution(n-1))>0;
		return sum;
    }
}
