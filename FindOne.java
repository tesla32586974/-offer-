package algorithm;

public class FindOne {
	public int NumberOf1Between1AndN_Solution(int n) {
	    int count = 0;
		for(int i=1; i<=n; i=i*10){
	    	int a = n/(i*10);
	    	int b = n%i;
	    	int split = (n/i)%10;
	    	if(split > 1)
	    		count = count + (a+1)*i;
	    	else if(split == 1)
	    		count = count + a*i + b + 1;
	    	else if(split == 0)
	    		count = count + a*i;
	    }
		return count;
    }
	
	public static void main(String[] args){
		FindOne a = new FindOne();
		a.NumberOf1Between1AndN_Solution(5);
	}
	
}
