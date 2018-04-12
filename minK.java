package algorithm;
import java.util.ArrayList;


public class minK {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		if(k<1 || input.length == 0 || k>input.length)
			return null;
		input = sort(input);
		ArrayList<Integer> rtn = new ArrayList<Integer>();
		for(int i=0; i<k; i++){
			rtn.add(input[i]);
		}
		return rtn;
    }
	
	public int [] sort(int [] input){
		for(int i=0; i<input.length; i++){
			for(int j=0; j<input.length - 1 - i; j++){
				if(input[j] > input[j+1]){
					//交换
					int tmp = input[j];
					input[j] = input[j+1];
					input[j+1] = tmp;
				}
			}
		}
		return input;
	}
}
