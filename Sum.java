package algorithm;

public class Sum {
	public int Add(int num1,int num2) {
        int num3 = num1 ^ num2;
        int num4 = (num1 & num2)<<1;
        if(num4 !=0 )
        	return Add(num3, num4);
        return num3;
    }
}
