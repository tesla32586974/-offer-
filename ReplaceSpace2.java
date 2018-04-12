package algorithm;
import java.util.Scanner;


public class ReplaceSpace2 {
	public String replaceSpace(StringBuffer str) {
		String[] strArr = str.toString().split("");
		str = new StringBuffer();
		for(int i=0; i<strArr.length; i++){
			if (strArr[i].equals(" "))
				str.append("%20");
			else
				str.append(strArr[i]);
		}
		return str.toString(); 
	    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		ReplaceSpace2 a = new ReplaceSpace2();
		System.out.println(a.replaceSpace(new StringBuffer(str)));
	}
}
