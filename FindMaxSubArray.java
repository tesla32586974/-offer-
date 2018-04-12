package algorithm;

public class FindMaxSubArray {
	public int FindGreatestSumOfSubArray(int[] array) {
        int maxNum = array[0];
        int currentNum = maxNum;
        for(int i=1; i<array.length; i++){
        	if(currentNum < 0 && array[i] > maxNum)
        		currentNum = maxNum = array[i];
        	else{
        		currentNum = currentNum + array[i];
        		if(maxNum < currentNum)
        			maxNum = currentNum;
        	}
        }
		return maxNum; 
    }
	
	public static void main(String[] args){
		int[] arr = {1,-2,3,10,-4,7,2,-5};
		FindMaxSubArray test = new FindMaxSubArray();
		test.FindGreatestSumOfSubArray(arr);
	}
}
