package algorithm;

public class TwoOnceNum {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        //首先对所有数做异或
		int num = 0;
		for(int i=0; i<array.length; i++){
			num = num^array[i];
		}
		//记录第一位不为1的位
		int index=0x01;
		while(num != 0){
			if((num&index) == index)
				break;
			index = index*2;//左移动
		}
		//根据该位是否为1将原来的数组分开，分别异或
		int number1 = 0, number2 = 0;
		for(int i=0; i<array.length; i++){
			if((array[i]&index) == index)
				number1 = number1^array[i];
			else
				number2 = number2^array[i];
		}
		num1[0] = number1;
		num2[0] = number2;
    }
	public static void main(String[] args){
		TwoOnceNum a = new TwoOnceNum();
		int[] arr = {2,4,3,6,3,2,5,5};
		a.FindNumsAppearOnce(arr, new int[1], new int[1]);
	}
}
