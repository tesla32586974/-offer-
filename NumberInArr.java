package algorithm;

public class NumberInArr {
	public int GetNumberOfK(int [] array , int k) {
	      int count = 0;
	      for(int i=0; i<array.length; i++){
	    	  if(array[i] == k)
	    		  count++;
	      }
	      return count;
    }
}
