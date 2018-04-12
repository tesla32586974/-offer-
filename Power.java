package algorithm;

public class Power {

    public double Power(double base, int exponent) {
    	if(base!=0 && exponent == 0)
    		return 1;
    	if(exponent<0){
    		base = 1/base;
    		exponent = -exponent;
    	}
    	double sum = base;
    	for(int i = exponent; i>1; i--)
    		sum = sum*base;
    	
    	return sum;
  }
	public static void main(String[] args) {
		Power a = new Power();
		System.out.println(a.Power(2.0, -3));
	}

}
