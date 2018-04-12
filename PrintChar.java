package algorithm;
import java.util.ArrayList;


public class PrintChar {
	public ArrayList<String> Permutation(String str) {
	       if(str == null)
	    	   return null;
	       ArrayList<String> strList = new ArrayList<String>();
	       subString("", strList, str);
	       
	       //去重
	       ArrayList<String> rtnList = new ArrayList<String>();
	       for(String item : strList){
	    	   boolean flg = false;
	    	   for(String item2 : rtnList){
	    		   if(item2.equals(item))
	    			   flg = true;
	    	   }
	    	   if(flg == false)
	    		   rtnList.add(item);
	       }
	       return rtnList;
    }
	
	public String subString(String preStr, ArrayList<String> strList, String str){
		char[] chr = str.toCharArray();
		if(preStr == str){
			return "";
		}
		
	    for(int i=0; i<chr.length; i++){
	    	   char removeChr = chr[i];
	    	   String newStr = new String();
	    	   for(int j=0; j<chr.length; j++){
	    		   if(j != i)
	    			   newStr = newStr + chr[j];
	    	   }
	    	   String nextStr = subString(preStr + removeChr, strList, newStr);
	    	   String addStr =  preStr + chr[i] + nextStr;
	    	  strList.add(addStr);
	    }
		return str;
	}
	
	public static void main(String[] args){
		String str = "aa";
		PrintChar a = new PrintChar();
		a.Permutation(str);
	}
}
