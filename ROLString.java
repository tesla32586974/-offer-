package algorithm;

public class ROLString {
	public String LeftRotateString(String str,int n) {
		if(n == 0)
        	return str;
		char [] chrs = str.toCharArray();
		if(chrs.length == 0)
			return "";
        char [] temp = new char[n];
        for(int i=0; i<n; i++){
        	temp[i] = chrs[i];
        }
        for(int i=0; i<chrs.length - n; i++){
        	chrs[i] = chrs[i+n];
        }
        for(int i=0; i<n; i++){
        	chrs[chrs.length - n + i] = temp[i];
        }
        StringBuilder rtnStr = new StringBuilder();
        for(char item : chrs){
        	rtnStr.append(item);
        }
        return rtnStr.toString();
    }
}
