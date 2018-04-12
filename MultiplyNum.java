package algorithm;

public class MultiplyNum {
	 public int[] multiply(int[] A) {
		 int[] B = new int[A.length];
		 for(int i=0; i<B.length; i++){
			 int product = 1;
			 for(int k=0; k<A.length; k++){
				 if(k!=i)
					 product = product*A[k];
			 }
			 B[i] = product;
		 }
		 return B;
	 }
	 
}
