package algorithm;
import java.util.ArrayList;


public class SlideWindown {
	int maxNum = -1; 
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
		ArrayList<Integer> maxList = new ArrayList<Integer>();
        if(size > num.length || size == 0)
        	return maxList; 
        maxList.add(maxNum);
        for(int start = 0; start+size<num.length+1; start++){
        	 for(int i=start; i<start + size; i++){
             	if(maxNum < num[i])
             		maxNum = num[i];
             }
        	
        	maxList.add(maxNum);
        	maxNum = -1;
        }
        return maxList;
    }
}
