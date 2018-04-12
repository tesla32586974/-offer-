package algorithm;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class StrStream {
	LinkedHashMap<String, Integer> chrs = new LinkedHashMap<String, Integer>();
	//Insert one char from stringstream
    public void Insert(char ch)
    {
        if(chrs.get(String.valueOf(ch)) == null){
        	chrs.put(String.valueOf(ch), 1);
        }else{
        	chrs.put(String.valueOf(ch), 2);
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	char rtn = '#';
    	Iterator<Map.Entry<String, Integer>> itr = chrs.entrySet().iterator();
    	while(itr.hasNext()){
    		Map.Entry<String, Integer> a = itr.next();
    		if(a.getValue() == 1){
    			rtn = a.getKey().toCharArray()[0];
    			break;
    		}
    	}
    	return rtn;
    }
}
