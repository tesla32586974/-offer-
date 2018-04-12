package algorithm;
import java.util.regex.*;

public class RegularNum {
	public boolean isNumeric(char[] str) {
        String strb = String.valueOf(str);
        //+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
        //但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
        boolean isMatch = Pattern.matches("[+-]?[0-9]*[.]?[0-9]*([eE][+-]?[0-9]+)?", "5e2");
        return isMatch;
    }
	public static void main(String[] args){
		RegularNum a = new RegularNum();
		char [] str = new char[0];
		a.isNumeric(str);
	}
}
