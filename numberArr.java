package algorithm;
import java.util.HashMap;


public class numberArr {
	public int MoreThanHalfNum_Solution(int [] array) {
		int arrLength = array.length;
        if(arrLength == 1)
            return array[0];
        HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
        int rtnNum = 0;
        for(int i=0; i<arrLength; i++){ 
        	if(arr.containsKey(array[i])){
        		int num = arr.get(array[i])+1;
        		if(num > arrLength/2)
        			return array[i];
        		arr.put(array[i], num);
        	}else{
        		arr.put(array[i], 1);
        	}
        } 
        return rtnNum;
    }
}
