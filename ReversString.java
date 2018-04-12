package algorithm;

public class ReversString {
	 public String ReverseSentence(String str) {
	        
		 String[] arr = str.split(" ");
		 if(arr.length < 2)
			 return str;
		 
	     for(int i=0; i<arr.length - 1 - i; i++){
	    	 String temp = arr[i];
	    	 arr[i] = arr[arr.length - 1 - i];
	    	 arr[arr.length - 1 - i] = temp;
	     }
	     String strb = new String();
	     strb = arr[0];
	     for(int i=1; i<arr.length; i++)
	    	 strb = strb + " " + arr[i];
	     return strb;
	 }
}
