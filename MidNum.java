package algorithm;
import java.util.LinkedList;

public class MidNum {
	LinkedList<Integer> numList = new LinkedList<Integer>();
	public void Insert(Integer num) {
	    int i = 0;
	    while(i < numList.size() && num < numList.get(i))
	    	i++;
	    if(i >= numList.size())
	    	numList.add(num);
	    else
	    	numList.add(i, num);
    }

    public Double GetMedian() {
    	
    	int mid = numList.size();
    	if(mid == 0)
        	return 0.0;
        if(mid%2 == 1)
        	return (double) numList.get(mid/2);
        else
        	return (double) ((numList.get(mid/2 - 1) + numList.get(mid/2))/2);
    }
}
