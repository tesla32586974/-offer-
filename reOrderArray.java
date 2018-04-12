package algorithm;

public class reOrderArray {
	 public void reOrderArray(int [] array) {
	        int [] oddArray = new int[array.length], evenArray = new int[array.length];
	        int k = 0;
	        int j = 0;
	        for(int i=0; i<array.length; i++){
	        	if(array[i]%2 == 1)
	        		oddArray[k++] = array[i];
	        	else
	        		evenArray[j++] = array[i];
	        }
	        int n=0;
	        for(int i=0; i<k; i++){
	        	array[i] = oddArray[n++];
	        }
	        n=0;
	        for(int i=k; i<k+j; i++){
	        	array[i] = evenArray[n++];
	        } 
	    }
	 public static void main(String[] args){
		 reOrderArray a = new reOrderArray();
		 int[] array  = {1,2,3,4,5,6,7};
		 a.reOrderArray(array); 
		 System.out.println("ok");
	 }
}
