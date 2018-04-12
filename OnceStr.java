package algorithm;
import java.util.HashMap;  


public class OnceStr {
	
	public int FirstNotRepeatingChar(String str) {
		if(str.equals(""))
			return -1;
		HashMap<String, Integer> strMap = new HashMap<String, Integer>();
		char[] chrs = str.toCharArray();
		for(char item : chrs){
			if(strMap.get(String.valueOf(item)) != null)
				strMap.put(String.valueOf(item), strMap.get(String.valueOf(item)) + 1);
			else
				strMap.put(String.valueOf(item), 1);
		}
		int i=0;
		for(char item : chrs){
			if(strMap.get(String.valueOf(item)) == 1)
				break;
			i++;
		}
		
		return i;
    }
	
	public static void main(String[] args){
		OnceStr a= new OnceStr();
		a.FirstNotRepeatingChar("google");
	}
}
