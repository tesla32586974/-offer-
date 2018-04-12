package algorithm;
import java.util.Scanner;


public class CheckBox {
	//等差数列
	public long get(long k){
		long node = 0;
		Double x = 0.0; 
		x = -0.5 +  0.5*Math.sqrt( 1 + 8 * (double)k); //依据求和公式的根计算有多少组连续编号
		System.out.println("x"+x);
		node = (int) Math.floor(x);//向下取整，求得多少组完整连续编号
		System.out.println("node"+node);
		long number = (int) (node*(node+1)*0.5);//计算完整的连续变化一共占了多少个格子
		System.out.println("number"+number);
		long result = 0;
		if(number == k){//当前格子是连续变化的最后一个，下一个从1开始
			result = node;
		}
		else{
			for(long i = number;i < k;i++){//从1开始计算编号，直至要查询的格子
				result++;
			}
		} 
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox a = new CheckBox(); 
		Scanner in=new Scanner(System.in);
		int boxNum=in.nextInt();
		System.out.println(a.get(boxNum));
	}
}
