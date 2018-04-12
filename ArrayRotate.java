package algorithm;

public class ArrayRotate {
	public int minNumberInRotateArray(int [] array) {
    	if(array.length == 0)
    		return 0;
    	int i=0;
    	while(array[i]<=array[i+1])
    		i++;
		return array[i+1]; 
    }
	public static void main(String[] args){
		ArrayRotate a = new ArrayRotate();
		int[] array = {3,4,5,1,2};
		System.out.println(a.minNumberInRotateArray(array));
	}
}
