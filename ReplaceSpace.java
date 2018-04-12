package algorithm;
import java.util.Scanner;


public class ReplaceSpace {
	public String replaceSpace(StringBuffer str) {
		String str2 = str.toString();
		String strNew = str2.replace(" ", "%20");//替换字符
		//String strNew = str2.replaceAll(" ", "%20");//正则表达式
		
		return strNew; 
	    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		ReplaceSpace a = new ReplaceSpace();
		System.out.println(a.replaceSpace(new StringBuffer(str)));
	}
}
