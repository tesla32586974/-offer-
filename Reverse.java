package algorithm;

public class Reverse {
	public int InversePairs(int [] array) {
		return (int) Partition(array);
    }
	
	public long Partition(int [] array){
		long count = 0;
		//小于2个元素没有逆序数
		 if(array.length < 2)
	        	return count;
		//先分割数组
		int breakPoint = array.length/2;
		int [] leftArr = new int[breakPoint];
		int [] rightArr = new int[array.length - breakPoint];
		for(int i=0; i<breakPoint; i++){
			leftArr[i] = array[i];
		}
		for(int i=0; i<array.length - breakPoint; i++){
			rightArr[i] = array[i+breakPoint];
		}
		//分别计算左右数组逆序数目并排序
		count = count + Partition(leftArr);
		count = count + Partition(rightArr);
		//计算逆序数,顺便排序
		int k = array.length - 1, kLeft = leftArr.length - 1, kRight = rightArr.length - 1;
		while(k >= 0){
			if(kLeft<0){
				array[k] = rightArr[kRight--];
				k--;
				continue;
			}
			if(kRight<0){
				array[k] = leftArr[kLeft--];
				k--;
				continue;
			}
			if(leftArr[kLeft] > rightArr[kRight]){
				array[k] = leftArr[kLeft--];
				count = count + kRight + 1;
			}else{
				array[k] = rightArr[kRight--];
			}
			k--;
		}
		return count%1000000007;
	}
	
	public static void main(String[] args){
		Reverse a = new Reverse();
		int[] arr = {3,2,1,0};
		a.InversePairs(arr);
	}
}
