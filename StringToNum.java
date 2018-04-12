package algorithm;

public class StringToNum {
	public int StrToInt(String str) {
        char[] chrs = str.toCharArray();
        int num = 0;
        int flg = 1;
        for(int i=0; i<chrs.length; i++){
        	if(i == 0 && chrs[i] == '-'){
        		flg = -1;
        		continue;
        	}
        	if(i == 0 && chrs[i] == '+')
        		continue;
        	if(chrs[i] >= '0' && chrs[i]<='9'){
        		num = num*10 + (chrs[i] - '0');
        	}else
        		return 0;
        }
        return num*flg;
       
    }
}
