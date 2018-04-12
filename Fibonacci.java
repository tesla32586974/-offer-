package algorithm;

public class Fibonacci {
	public int Fibonacci(int n) {
		int k1=1;
		int k2=1;
		int k = 0;
		if(n==1 || n==2)
			return 1;
		for(int i=2; i<n; i++){
			k = k1+k2;
			k1=k2;
			k2=k;
		}
		return k;
    }
	public static void main(String[] args){
		Fibonacci a = new Fibonacci(); 
		System.out.println(a.Fibonacci(5));
	}
}
