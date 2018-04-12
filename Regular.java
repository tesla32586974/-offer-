package algorithm;

public class Regular {
	public boolean match(char[] str, char[] pattern)
    {	
		//两个字符情形
		int pptn=0;
		int pstr = 0;
		return matchCore(str, pstr, pattern, pptn);
    }
	
	public boolean matchCore(char[] str,int pstr, char[] pattern, int pptn){
		
		//模式完了，字符串还剩下，匹配失败
        	if(pptn == pattern.length){
        		if(pstr == str.length)
        			return true;
        		else
        			return false;
        	}
        	else{
        		if(pstr == str.length){
        			//字符串空了，模式必须是 *
        			if(pptn + 1 < pattern.length && pattern[pptn + 1] == '*')
        				return matchCore(str, pstr, pattern, pptn+2);
        			else
        				return false;
        		}
        		if(pstr >= str.length || (pptn+1<pattern.length && pattern[pptn+1] == '*')){
        			//模式第二个是*
        			//a*bbc  bbc的情形 -- 模式跳过两个,字符不动
        			//a*bbc  aaaaabbc的情形 -- 字符跳过一个,模式不动
        			//a*abc  abc的情形 -- 模式跳过两个,字符不动
        			if(pattern[pptn] == '.' || pattern[pptn] == str[pstr])
        				return matchCore(str, pstr, pattern, pptn+2)||matchCore(str, pstr+1, pattern, pptn);
        			else
        				return matchCore(str, pstr, pattern, pptn+2);
        		}else{
        			//模式第二个不是*或者无第二个
        			if(pattern[pptn] == '.' || pattern[pptn] == str[pstr]){
        				return matchCore(str, pstr+1, pattern, pptn+1);
        			}else{
        				return false;
        			}
        		}
        	}
	}
	
	public static void main(String[] args){
		Regular test = new Regular();
		char[] a = new char[2];
		char[] b = new char[3];
		a[0] = 'a';
		a[1] = 'a';
//		a[2] = 'a';
		b[0] = 'b';
		b[1] = '*';
		b[2] = 'a';
//		b[3] = 'a';
		
		boolean flg = test.match(a, b);
		System.out.print(flg);
	}
}
