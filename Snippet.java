package algorithm;


public class Snippet {
	public int InversePairs(int [] array) {
			return (int) Partition(array);
	    }
		
		public long Partition(int [] array){
			long count = 0;
			//С��2��Ԫ��û��������
			 if(array.length < 2)
		        	return count;
			//�ȷָ�����
			int breakPoint = array.length/2;
			int [] leftArr = new int[breakPoint];
			int [] rightArr = new int[array.length - breakPoint];
			for(int i=0; i<breakPoint; i++){
				leftArr[i] = array[i];
			}
			for(int i=0; i<array.length - breakPoint; i++){
				rightArr[i] = array[i+breakPoint];
			}
			//�ֱ������������������Ŀ������
			count = count + Partition(leftArr);
			count = count + Partition(rightArr);
			//����������,˳������
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
}