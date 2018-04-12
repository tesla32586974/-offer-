package algorithm;

public class Number {
	  public int NumberOf1(int n) {
		  int k = 0;
		  int flg = 1;
		  for(int i=0; i<32 ;i++)
		  {
			  if((n&flg) == flg)
				  k++;
			  flg = flg<<1;
		  } 
		  
		  return k;
	    }
	  public static void main(String[] args) {
		  Number a = new Number();
			System.out.println(a.NumberOf1(-1)); 
		}
}
